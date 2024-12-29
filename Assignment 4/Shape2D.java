public class Shape2D {
    public String shape;
    double area ;
    public Shape2D(){
        this.shape = "Square";
        int a =5;
        System.out.println("A "+ shape +" has been created with length: " + a+" .");
        this.area = a*a;
    }
    public Shape2D(int len, int br){
        this.shape = "Rectangle";
        System.out.println("A "+ shape +" has been created with length: " + len+" and breadth : "+ br);
        this.area = len*br;

    }
    public Shape2D(int height, int base, String sh){
        this.shape = sh;
        System.out.println("A "+ shape +" has been created with height: " + height+" and base : "+ base);
        this.area = (1.0/2.0)*(base*height);
    }
    public Shape2D(int a, int b, int c){
        this.shape = "Triangle";
        System.out.println("A "+ shape +" has been created with the following sides: " + a + ", "+ b+ ", "+c);
        double peri = (a+b+c)/2.0;
        double x = (peri* (peri-a)*(peri-b)*(peri-c));
        this.area = Math.sqrt(x);
    }

    public void area(){
        System.out.printf("The area of the "+ shape + " is %.2f\n", area);
            
    }
}
