public class Teacher {
    public String name;
    public String initial;
    int count=0;
    int count2=0;
    String course[] = new String [3];

    public Teacher(String name, String initial){
        this.name = name;
        this.initial = initial;
        System.out.println("A new Teacher has been created.");
    }
    public void addCourse(Course obj){
        if(count<3){
        course[count++]= obj.course;
        count2++;
        }
    }

    public void printDetail(){
        System.out.println("Name: "+ name);
        System.out.println("Initial: "+ initial);
        System.out.println("List of Courses");
        for (int i =0; i<count2 ;i++){
            System.out.println(course[i]);
        }
    }

}
