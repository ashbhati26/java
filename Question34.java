public class Question34 {
        public static void main(String[] args) {
            // Create an anonymous class that overrides the run() method of the Thread class
            Thread thread = new Thread() {
                @Override
                public void run() {
                    System.out.println("Hello from anonymous class!");
                }
            };
    
            // Start the thread
            thread.start();
        }
}