public class Cart{
    public String name ;
    public double price[];
    public String item[];
    
    public int count ;
    public int size =3;;
    public double discount =0.0;
    public double total =0.0;

    public void create_cart(int n){
        name = "Cart " + n;
        price = new double[size];
        item = new String[size];
        
    }

    public void addItem(String item, double price) {
        if (count < size) {
            this.item[count] = item;
            this.price[count] = price;
            count++;
            System.out.println(item + " added to "+name);
            System.out.println("You have "+count+" item(s) in your cart now.");
        }
        else{
            System.out.println("You already have 3 items on your cart");
        }
    }

    public void addItem(double price, String item) {
        addItem(item, price);
    }

    public void cartDetails(){
        System.out.println("Your Cart ("+name+")"+": ");
        for (int i= 0; i<count; i++){
            System.out.println(item[i] + " : " + price[i]);
        }
        System.out.println("Discount Applied: "+ discount+"%");
        total =0;
        for (int j= 0; j<count; j++){
            total += price[j];
        }
        total = total - (total * discount/100);
        System.out.println("Total price: "+ total);

        
    }

    public void giveDiscount(double discount){
        this.discount = discount;
    }
}