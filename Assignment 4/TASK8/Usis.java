public class Usis {

    public boolean login;
    public int totalAdvisee;
    public String student[]= new String [5];

    public Usis(){
        System.out.println("Usis is ready to use!");
    }

    public void login(Student obj){
        if(obj.email.equals("null")&&obj.password.equals("null")){
            System.out.println("Email and password need to be set.");
        }
        else{
            login = true;
            System.out.println("Login Successfull.");
        }

    }

    public void advising(Student obj){
        if(!login){
            System.out.println("Please login to advise courses!"); 
        }
        else {
            System.out.println("You haven't selected any courses."); 
        }
    }

    public void advising(Student obj, String c1, String c2, String c3){
        if(!login){
            System.out.println("Please login to advise courses!"); 
        }
        System.out.println("Advising Successful.");
        obj.courses = c1 + " "+ c2+ " "+ c3;
        if(totalAdvisee>5){
            System.out.println("Cannot advise more.");
        }
        student [totalAdvisee++] ="Name: "+ obj.name + " ID: "+ obj.id + "\nDepartment: "+ obj.dept+ "\nAdvised Courses: \n"+ obj.courses;

    }
    public void advising (Student obj, String c1, String c2, String c3, String c4){
        System.out.println("You need special approval to take more than 3 courses."); 
    }

    public void allAdviseeInfo(){
        System.out.println("Total Advisee: "+totalAdvisee);
        for (int i =0; i<totalAdvisee;i++){
            System.out.println(student[i]);
            System.out.println("==============");
        }
    }
}
