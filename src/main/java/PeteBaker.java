import java.util.Map;

public class PeteBaker {
    /*
    Пит любит печь торты. У него есть несколько рецептов и ингредиентов.
    К сожалению, он не силен в математике.
    Можете ли вы помочь ему узнать, сколько тортов он мог бы испечь, учитывая его рецепты?
    Напишите функцию cakes(), которая берет рецепт (объект) и доступные ингредиенты (тоже объект) и
    возвращает максимальное количество тортов, которые Пит может испечь (целое число).
    Для простоты нет единиц измерения для количества (например, 1 фунт муки или 200 г сахара просто 1 или 200).
    Ингредиенты, которые отсутствуют в объектах, можно считать 0.
     */

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int min = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
            Integer value = entry.getValue();
            String key = entry.getKey();
            Integer valueAvailable = available.get(key);
            if (!available.containsKey(key) || value > valueAvailable) {
                return 0;
            } else {
                min = available.get(key) / value < min ? valueAvailable / value : min;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1,
                "milk", 100);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        System.out.println(cakes(recipe, available));
    }
}