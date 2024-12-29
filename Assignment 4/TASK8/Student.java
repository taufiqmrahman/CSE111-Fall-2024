public class Student{

    public String name;
    public String dept;
    public int id;
    public String email="null";
    public String password="null";
    public String courses;

    public Student (String name, int id, String dept){
        this.name = name;
        this.id = id;
        this.dept = dept;
        System.out.println("Student object is created.");
    }
    
    
}