package designpattern.structural.flyingweight;

public class FlyingBullet {
    private Bullet bullet;
    private int direction;
    private int currentSpeed;

    FlyingBullet(Bullet bullet){
        this.bullet = bullet;
    }

    public void setDirection(int direction){
        this.direction = direction;
    }

    public int getDirection(){
        return direction;
    }

    public void setCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

}
