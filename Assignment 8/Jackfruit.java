public class Jackfruit extends Fruit{
    
    public Jackfruit(){
        super(false, "JackFruit");
    }
    @Override
    public String toString(){
        if(!super.hasFormalin()){
            return "Jackfruits are good for you.";
        }
        else{
            return "Jackfruits are bad for you.";
        }
    }
}