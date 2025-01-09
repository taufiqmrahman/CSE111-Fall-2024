public class Vehicle2010 extends Vehicle {
    
    public void moveLowerLeft(){
        moveDown();
        moveLeft();
    }
    public void moveLowerRight(){
        moveDown();
        moveRight();
    }
    public void moveUpperRight(){
        moveUp();
        moveRight();
    }
}
