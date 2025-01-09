public class Cat extends Animal {
    
    public String breed;
    public Cat(String name, int age, String color , String breed){
        super(name,age,color);
        this.breed = breed;
    }

    @Override
    public void makeSound(){
        System.out.println(color +" color "+name + " is Meowing.");
    }
    
    @Override
    public String info(){
        return super.info()+"Breed: "+ breed;
    }
}
