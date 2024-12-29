//task5
public class Course {
    public String name ="";
    public String code ="";
    public int credit ;

    public void updateDetails(String name1, String code1, int cr){
        name = name1;
        code = code1;
        credit =cr;
    }
    public void displayCourse(){
        System.out.println("Course name: "+ name);
        System.out.println("Course code: "+ code);
        System.out.println("Course credit: "+ credit);
        

    }
}
