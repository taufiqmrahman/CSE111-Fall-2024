public class Student{
    public int id;
    public double cg;
    public String [] courses = new String [4];
    public int count;

    public Student(int id){
        this.id = id;
        System.out.println("A student with ID "+id+" has been created.");
    }

    public Student(int id, double cg){
        this.id = id;
        this.cg = cg;
        System.out.println("A student with ID "+id+" and CGPA "+cg+" has been created.");
    }

    public void storeCG(double cg){
        this.cg = cg;
    }
    public void storeID(int id){
        this.id = id;
    }
    public void addCourse(String c){
        if (cg==0.0){
            System.out.println("Failed to add "+ c);
            System.out.println("Set CG first");
        }
        else if (cg<3.0){
            if(count<3){
                courses[count++] = c;
            }
            else{
            System.out.println("Failed to add "+ c);
            System.out.println("CG is low. Can't add more than 3 courses.");
            }
            
        }
        else{
            if(count < 4){
                courses[count++] =c;
            }
        }
    }

    public void addCourse(String []arr){
        int size = arr.length;
        if(size<=4){
            for (int i=0; i<size;i++){
                addCourse(arr[i]);
            }
        }
        else{
            for (int i=0; i<size;i++){
                addCourse(arr[i]);
            }
            System.out.println("Failed to add "+ arr[size-1]);
            System.out.println("Maximum 4 courses allowed.");
        }
        
    }

    public void removeAllCourse(){
        courses = new String [4];
        count =0;
    }
    public void showAdvisee(){
        System.out.println("Student ID: "+ id+", CGPA: "+ cg);
        if (count ==0){
            System.out.println("No Courses added");
        }
        else{
            System.out.println("Added Courses are: ");
            for (int i=0; i< count;i++){
                System.out.print(courses[i]+ " ");
            }
            System.out.println();
        }
        
    }






}

