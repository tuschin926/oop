package c6.b6_4;

import c6.b6_3.MovablePoint;

public class MovableCircle implements Movable{
    public int radius;
    public MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius=radius;
        this.center= new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    @Override
    public void moveRight() {
        center.x+=center.xSpeed;
    }

    @Override
    public void moveLeft() {
        center.x-=center.xSpeed;
    }

    @Override
    public void moveDown() {
        center.y-=center.ySpeed;
    }

    @Override
    public void moveUp() {
        center.y+=center.ySpeed;
    }
}
