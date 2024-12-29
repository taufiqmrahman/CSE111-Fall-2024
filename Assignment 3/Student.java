public class Student{
    public String name = "Not Set";
    public String dep = "CSE";
    public double cgpa;
    public int credit = 9;
    public String sc = "Not Set";


    public void showDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Department: "+ dep);
        System.out.println("CGPA: "+ cgpa);
        System.out.println("Credits: "+ credit);
        System.out.println("Scholarship: "+ sc);
    }
    public void updateDetails(String n, double c){
        this.name = n;
        this.cgpa =c;

    }
    public void updateDetails(String n, double c, int cr, String dep){
        this.name = n;
        this.cgpa =c;
        this.credit = cr;
        this.dep = dep;

    }
    public void updateDetails(String n, double c, int cr){
        this.name = n;
        this.cgpa =c;
        this.credit = cr;
    }

    public void checkScholarshipEligibility(){
        if(cgpa>=3.5 && credit>10){
            if(cgpa>=3.5 && cgpa<3.7){
                sc = "Need based";
                System.out.println(name+" is eligible for "+ sc + " scholarship.");
            }
            else if(cgpa >=3.7){
                sc = "Merit based";
                System.out.println(name+" is eligible for "+ sc + " scholarship.");
            }

        }
        else{
            sc = "No Scholarship";
            System.out.println(name+" is not eligible for scholarship.");
        }
    }
}