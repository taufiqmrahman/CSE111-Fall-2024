public class Striker extends Football{
    
    public double goals;
    public double onTarget;

    public Striker(String name, int age, int stamina, int goals, int onTarget){
        super(name,age, stamina);
        this.goals = goals;
        this.onTarget = onTarget;
    }
    @Override
    public void calculatePerformance(){
        System.out.println("Performance: "+goals / onTarget);
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Goals "+ this.goals);
        System.out.println("Target on Goals: "+ this.onTarget);
    }
}