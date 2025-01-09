public class Manager extends Employee{
    
    public double bonus;
    public double final_salary;
    public int increment;

    public Manager(String name,int salary, int workhrs, double bonus){
        super(name, salary, workhrs);
        this.bonus = bonus;
    
    }
    public void requestIncrement(int increment){
        if(super.getHoursWorked()>100){
            this.increment = increment;
            System.out.println("$"+increment+ " Increment Approved.");
            setBaseSalary(super.getBaseSalary() + this.increment);
        }
        else if(super.getHoursWorked()>80 && super.getHoursWorked()<=100){
            this.increment = increment/2;
            System.out.println("$"+this.increment+ " Increment Approved.");
            setBaseSalary(super.getBaseSalary() + this.increment);
        }
        else{
            this.increment = 0;
            System.out.println("Increment Denied.");
        }
        
    }
    public void calculateSalary(){
        final_salary = super.getBaseSalary();
        if (super.getHoursWorked() > 40) {
            final_salary += (super.getBaseSalary() * (bonus/100.0));
        }
        else{
            final_salary = super.getBaseSalary();
        }
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: " + bonus + "%");
        System.out.println("Final Salary: $" + final_salary);
    }
}
