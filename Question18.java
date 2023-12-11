public class Question18 {
    public static void main(String[] args) {
        try {
            checkEven(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkEven(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }
}
