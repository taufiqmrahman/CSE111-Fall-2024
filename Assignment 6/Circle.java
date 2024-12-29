public class Circle {
    
    public static int count;
    private double radius;


    public Circle(int r){
        this.radius = r;
        count++;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public double area(){
        return 3.1416*radius*radius;
    }
    
}
