// Question14
    public class Circle {
        private double radius;
    
        // No-arg constructor with default radius value of 1
        public Circle() {
            this.radius = 1.0;
        }
    
        // Parameterized constructor
        public Circle(double radius) {
            this.radius = radius;
        }
    
        // Getter for radius
        public double getRadius() {
            return radius;
        }
    
        // Getter for area
        public double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }
    
        public static void main(String[] args) {
            // Construct three Circle objects with different radii
            Circle circle1 = new Circle(3.0);
            Circle circle2 = new Circle(3.2);
            Circle circle3 = new Circle(4.1);
    
            // Display the radius and area of each circle
            System.out.println("Circle 1 - Radius: " + circle1.getRadius() + ", Area: " + circle1.getArea());
            System.out.println("Circle 2 - Radius: " + circle2.getRadius() + ", Area: " + circle2.getArea());
            System.out.println("Circle 3 - Radius: " + circle3.getRadius() + ", Area: " + circle3.getArea());
        }
    }