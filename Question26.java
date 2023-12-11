public class Question26 {
    public static String getSubstring(String str, int startPos, int endPos) {
        return str.substring(startPos, endPos);
    }   
    public static void main(String[] args) {
        String str = "Hello World!";
        int startPos = 2;
        int endPos = 7;
        System.out.println("The given string is: " + str);
        System.out.println("The substring from position " + startPos + " to position " + endPos + " is: " + getSubstring(str, startPos, endPos));
    }
}