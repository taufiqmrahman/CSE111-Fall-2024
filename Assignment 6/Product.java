public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){
        this.name = "Unknown";
        this.price = 0.0;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getPrice(){
        return this.price;
    }

    public void displayInfo(){
        System.out.print("Product name: "+ this.name +"\nPrice: $"+ this.price );
    }
    public void displayInfo(boolean var){
        if(var==true){
            displayInfo();
            System.out.println();
            System.out.println("Quantity: " + this.quantity);
        }
        else{
            displayInfo();
            System.out.println();
        }
    }


}
