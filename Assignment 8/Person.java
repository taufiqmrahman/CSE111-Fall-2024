public class Person {
    
    public String name;
    public String job;
    public int age;
    public String dose;
    public boolean firstDose = false;
    public boolean secondDose = false;
    public String vaccine;
    public int days;

    public Person(String name, int age){
        this.name = name;
        this.age= age;  
        this.job = "General Citizen.";
    }

    public Person(String name, int age, String job){
        this.name = name;
        this.age= age;
        this.job = job;
    }
    public void pushVaccine(Vaccine v1, String dose) {
        if (dose.equals("1st Dose")) {
            if (firstDose) {
                System.out.println("Sorry " + this.name + ", you already received the first dose.");
            } 
            else {
                firstDose = true;
                vaccine = v1.getVaccine();
                days = v1.getDays();
                System.out.println("1st dose done for " + this.name);
            }
        } 
        else if (dose.equals("2nd Dose")) {
            if (!firstDose) {
                System.out.println("Sorry " + this.name + ", Invali dose request.");
            } 
            else if (secondDose) {
                System.out.println("Sorry " + this.name + ", you already received both doses.");
            } 
            else if (!vaccine.equals(v1.getVaccine())) {
                System.out.println("Sorry " + this.name + ", you can't take 2 different vaccines.");
            } 
            else {
                secondDose = true;
                System.out.println("2nd dose done for " + this.name);
            }
        } 
        else {
            System.out.println("Sorry " + this.name + ", invalid dose request.");
        }
    }

    public void pushVaccine(Vaccine v1) {
        if (job.equals("Student")) {
            pushVaccine(v1, "1st Dose");
        } 
        else {
            if (age < 25) {
                System.out.println("Sorry " + this.name + ", Minimum age for taking vaccines is 25 years now.");
            } 
            else {
                pushVaccine(v1, "1st Dose");
            }
        }
    }

    public void showDetail(){
        System.out.println("Name :"+ name + " Age: "+ age + " Type: "+ job);
        System.out.println("Vaccine name: "+ vaccine);
        if(firstDose){
            System.out.println("1st Dose: Given");
        }
        if(!secondDose){
            System.out.println("2nd Dose: Please come after "+ days + " days");
        }
        else{
            System.out.println("2nd Dose: Given");
        }

    }


}
