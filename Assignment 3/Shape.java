public class Shape {
    String shape;
    double area;

    public void setParameters(String s, int radius){
        shape =s;
        area = 3.1416*radius*radius;
    }

    public void setParameters(String s, int base, int height){
        shape = s;
        area = (1.0/2.0) * base * height;
    }

    public void setParameters(String s, double breadth , double length){
        shape =s;
        area = length * breadth;
    }

    public String details(){
        String s1 = "Shape Name: " +shape +"\n"+"Area: "+ area; 
        return s1 ;
    }
}
