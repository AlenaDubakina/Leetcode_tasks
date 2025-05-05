public class IsPalindrome {
    /*
    Фраза является палиндромом, если после преобразования всех заглавных букв в строчные и
    удаления всех небуквенно-цифровых символов она читается одинаково и слева направо, и справа налево.
    Буквенно-цифровые символы включают буквы и цифры.
    Если задана строка s, вернуть значение true, является ли она палиндромом ,
    или false в противном случае .
     */

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[\\W_]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}