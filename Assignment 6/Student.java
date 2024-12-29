public class Student {
    
    public String name;
    public double cg;
    public static int id;
    public String dept = "CSE";
    public static int cse;
    public static int others;
    
    public Student(String name, Double cg){
        this.name = name;
        this.cg= cg;
        id++;
        cse++;
    }
    public Student(String name, Double cg,String dept){
        this.name = name;
        this.cg= cg;
        this.dept = dept;
        id++;
        others++;
    }
    public static void printDetails(){
        System.out.println("Total Student(s): "+ id);
        System.out.println("CSE Student(s): "+ cse);
        System.out.println("Other Department Student(s): "+ others);
    }
    public void individualDetail(){
        System.out.println("ID: "+ Student.id);
        System.out.println("Name: "+ this.name);
        System.out.println("CGPA: "+ this.cg);
        System.out.println("Department: "+ dept);

    }

}
