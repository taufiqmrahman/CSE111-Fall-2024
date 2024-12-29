public class Toy {

    String name;
    int price;

    public Toy(String name,int price){
        this.name = name;
        this.price = price;
        System.out.println("A new toy has been made!");

    }
    public void updatePrice(int price){
        this.price = price;
    }
    public void updateName(String name){
        System.out.println("Changing old name: "+ this.name);
        this.name = name;
        System.out.println("New name: "+ name);
    }
    public void showPrice(){
        System.out.println("Price: "+ price + " Taka");
    }

}
