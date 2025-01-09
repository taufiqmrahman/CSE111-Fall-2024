public class Defender extends Football{
    
    public double tackles;
    public double interc;

    public Defender(String name, int age, int stamina, int tackles, int interc){
        super(name,age, stamina);
        this.tackles = tackles;
        this.interc = interc;
    }
    @Override
    public void calculatePerformance(){
        System.out.println("Performance: "+interc / tackles);
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Tackles: "+ this.tackles);
        System.out.println("Interceptions: "+ this.interc);
    }
}