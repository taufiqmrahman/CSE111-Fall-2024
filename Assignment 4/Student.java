public class Student{
    String name;
    String prog;
    public Student(String name, String prog){
       this.name = name;
       this.prog = prog;
    }

    public void updateName(String name){
        this.name = name;
    }
    public void updateProgram(String dept){
        this.prog = dept;
    }
    public String accessProgram(){
        return this.prog;
    }
}