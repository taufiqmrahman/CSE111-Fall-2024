public class Book {

    public static int total_books_sold;
    public static double total_revenue;
    public String title;
    public int discountPercentage;
    public double price = 150.0;

    public Book(String title, int discount){
        this.title = title;
        this.discountPercentage = discount;
        this.price = discount_price();
        total_books_sold++;
        total_revenue += this.price;
        
    }
    public void bookDetails(){
        System.out.println("Title: "+ this.title);
        System.out.println("Price after Discount: "+ this.price);
    }

    private double discount_price(){
        return this.price -(this.price* discountPercentage/100.0);
        
    }
}
