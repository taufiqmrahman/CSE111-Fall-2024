//task8
public class Employee {
    public String name = "";
    public double salary = 30000.0;
    public String designation = "junior";

    public void newEmployee(String s){
        name = s;
    }

    public void displayInfo(){
        System.out.println("Employee Name: "+ name);
        System.out.println("Employee Salary: "+ salary + " Tk");
        System.out.println("Employee Designation: " + designation);
        
    }

    public void promoteEmployee(String inp){
        designation = inp;
        if(inp.equals("senior")){
            salary += 25000;
        }
        else if(inp.equals("lead")){
            salary += 50000;
        }
        else if(inp.equals("manager")){
            salary += 75000;
        }
        
        System.out.println(name + " has been promote to "+ designation);
        System.out.println("New Salary: "+ salary);
        
    }

    public void calculateTax(){
        double tax ;
        if(salary <= 30000){
            System.out.println("No need to pay tax");
        }
        else if(salary >30000 && salary <50000){
             tax = salary * (10.0/100);
             System.out.println(name + " Tax Amount: "+ tax);

        }
        else if (salary >50000){
            tax = salary * (30.0/100);
            System.out.println(name + " Tax Amount: "+ tax);
        }

    }
}
