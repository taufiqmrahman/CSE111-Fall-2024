public class Dragon extends MagicalCreature {
    
    public int power_level;

    public Dragon(String name, int age, int power){
        super(name, age);
        power_level = power;

    }

    @Override
    public void makeSound(){
        System.out.println(super.name + " roars with a fiery breath!");
    }

    @Override
    public void performMagic(){
        System.out.println(super.name + " breathes fire with power level: "+ power_level);
    }

    public void fly(){
        System.out.println(super.name + " flies through the sky.");
    }
}
