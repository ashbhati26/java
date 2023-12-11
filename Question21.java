public class Question21 {

    public static boolean checkAllVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test the checkAllVowels method
        String testString1 = "aeiou";
        String testString2 = "hello";

        System.out.println("Test String 1: " + testString1);
        System.out.println("All vowels present: " + checkAllVowels(testString1));

        System.out.println("\nTest String 2: " + testString2);
        System.out.println("All vowels present: " + checkAllVowels(testString2));
    }
}
