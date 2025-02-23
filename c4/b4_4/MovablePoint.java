package c4.b4_4;


    public class MovablePoint extends Point {
        private float xSpeed = 0.0f;
        private float ySpeed = 0.0f;

        // Constructors
        public MovablePoint() {
            super();
            this.xSpeed = 0.0f;
            this.ySpeed = 0.0f;
        }

        public MovablePoint(float xSpeed, float ySpeed) {
            super();
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        // Getters and Setters
        public float getXSpeed() { return xSpeed; }
        public void setXSpeed(float xSpeed) { this.xSpeed = xSpeed; }

        public float getYSpeed() { return ySpeed; }
        public void setYSpeed(float ySpeed) { this.ySpeed = ySpeed; }

        public void setSpeed(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public float[] getSpeed() {
            return new float[]{xSpeed, ySpeed};
        }

        // Override toString()
        @Override
        public String toString() {
            return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
        }

        // Move Method
        public MovablePoint move() {
            x += xSpeed;
            y += ySpeed;
            return this;
        }
    }

