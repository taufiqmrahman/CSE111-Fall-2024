public class Mango extends Fruit{
    
    public Mango(){
        super(true, "Mango");
    }
    @Override
    public String toString(){
        if(!super.hasFormalin()){
            return "Mangos are good for you.";
        }
        else{
            return "Mangos are bad for you.";
        }
    }
}