package c4.b4_5;


    public class Circle extends Shape {
        private double radius = 1.0;

        // Constructors
        public Circle() {}

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        // Getters and Setters
        public double getRadius() { return radius; }
        public void setRadius(double radius) { this.radius = radius; }

        public double getArea() { return Math.PI * radius * radius; }
        public double getPerimeter() { return 2 * Math.PI * radius; }

        // Override toString()
        @Override
        public String toString() {
            return "Circle[" + super.toString() + ", radius=" + radius + "]";
        }
    }

