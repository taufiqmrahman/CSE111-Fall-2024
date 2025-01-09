public class Phoenix extends MagicalCreature {
    
    public int rebirth;
    public Phoenix(String name, int age, int rbth){
        super(name, age);
        this.rebirth = rbth;
    }

    @Override
    public void makeSound(){
        System.out.println(super.name + " sings an enchanting song.");
    }

    @Override
    public void performMagic(){
        System.out.println(super.name + " is reborn with "+rebirth+" rebirth cycles.");
    }

    public void regenerate(){
        System.out.println(super.name+ " regenerates its body in a burst of flames.");
    }


}
