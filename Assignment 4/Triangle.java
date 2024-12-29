public class Triangle {
    int perimeter;
    String type;
    int s1;
    int s2;
    int s3;
    
    public void updateSides(int s1, int s2, int s3){
        this.s1= s1;
        this.s2 = s2;
        this.s3 = s3;
        perimeter = s1+s2+s3;
        if (s1==s2&&s2==s3&&s1==s3){
            type = "Equilateral";
        }
        else if (s1!=s2 && s2!=s3 && s1!=s3){
            type = "Scalene";
        }
        else{
            type = "Isosceles";
        }

    }
    public void triangleDetails(){
        System.out.println("Three sides of the triangle are: "+ s1 +", "+ s2+", "+ s3);
        System.out.println("Perimeter: "+ perimeter);

    }

    public String printTriangleType(){
        if(type.equals("Equilateral")){
            return "This is an Equilateral Triangle.";
        }
        else if (type.equals("Scalene")){
            return "This is a Scalene Triangle.";
        }
        else {
            return "This is an Isosceles Triangle.";
        }
    }
    public void compareTrinagles(Triangle obj){
        if(this == obj){
            System.out.println("These two triangle objects have the same address.");
        }
        else if (this.s1 == obj.s1 && this.s2 == obj.s2 && this.s3 == obj.s3) {
            System.out.println("Addresses are different but the sides of the triangles are equal.");
        } else if (this.perimeter == obj.perimeter) {
            System.out.println("Only the perimeter of both triangles is equal.");
        } else {
            System.out.println("Addresses, length of the sides and perimeter all are different.");
        }
    }


}
