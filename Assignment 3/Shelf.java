public class Shelf {
    int capacity;
    int book;

    public void showDetails(){
        System.out.println("Shelf Capacity : "+ capacity);
        System.out.println("Number of books : "+ book);

    }
    public void addBooks(int n){
        int a = book;
        a += n;
        if (capacity ==0){
            System.out.println("Zero capacity. Cannot add books.");
        }
        else if(a> capacity){
            System.out.println("Exceeds Capacity.");
        }
        else{
            book += n;
            System.out.println(n + " books added to the shelf.");
        }

    }




}

