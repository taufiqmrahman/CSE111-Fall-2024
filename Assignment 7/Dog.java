public class Dog extends Animal {
    
    public String breed;
    public Dog(String name, int age, String color , String breed){
        super(name,age,color);
        this.breed = breed;
    }

    @Override
    public void makeSound(){
        System.out.println(color +" color "+name + " is Barking.");
    }

    @Override
    public String info(){
        return super.info()+"Breed: "+ breed;
    }
}
