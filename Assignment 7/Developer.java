public class Developer extends Employee {
    
    public String language;
    public double final_salary;

    public Developer(String name,int salary, int workhrs, String language){
        super(name, salary, workhrs);
        this.language = language;

    }
    
    public void calculateSalary(){
        if(this.language.equals("Java")){
            final_salary = super.getBaseSalary() + 700;
        }
        else {
            final_salary = super.getBaseSalary();
        }
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language: " + language);
        System.out.println("Final Salary: $" + final_salary);
    }
    
}
