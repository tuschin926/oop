package c4.b4_4;


    public class Point {
        protected float x = 0.0f;
        protected float y = 0.0f;

        // Constructors
        public Point() {
            this.x = 0.0f;
            this.y = 0.0f;
        }

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        // Getters and Setters
        public float getX() { return x; }
        public void setX(float x) { this.x = x; }

        public float getY() { return y; }
        public void setY(float y) { this.y = y; }

        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float[] getXY() {
            return new float[]{x, y};
        }

        // Override toString()
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }


