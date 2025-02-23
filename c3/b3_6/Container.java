package c3.b3_6;

public class Container {
    private int x1,y1,x2,y2;

    public Container(int x, int y, int width, int height){
        this.x1=x;
        this.y1=y;
        this.x2=x+width-1;
        this.y2=y+height-1;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }
    public boolean collidesWith(Ball ball){
        if(ball.getX()- ball.getRadius() <=this.x1 || ball.getX()-ball.getRadius() >= this.x2){
            ball.reflecHorizontal();
            return true;
        }
        if(ball.getY()- ball.getRadius()<=this.y1 || ball.getY() + ball.getRadius() >= this.y2){
            ball.reflecVertical();
            return  true;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Container{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}
