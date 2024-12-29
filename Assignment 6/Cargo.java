public class Cargo{

    public static double capacity = 10.0;
    public String contents ;
    public double weight;
    public boolean loaded = false;
    public static int cargo =0;
    public int cargoId;

    public static double capacity(){
        return capacity;
    }
    public Cargo(String contents, double weight){
        this.contents = contents;
        this.weight = weight;
        this.cargoId = ++cargo;
    }
    public void load(){
        if(weight <= capacity){
            capacity -= weight;
            loaded = true;
            System.out.println("Cargo " +cargoId +" loaded for transport.");
        }
        else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }

    }
    public void unload(){
        capacity += weight;
        loaded = false;
        System.out.println("Cargo " +cargoId +" unloaded.");
    }

    public void details(){
        System.out.println("Cargo ID :" +cargoId +", " +"Contents: " +contents +", " +"Weight: " +weight +", " +"Loaded: " +loaded);
    }
}