public class Library {
    public int Capacity ;
    int count =0;
    public String book[];
    public void setBookCapacity(int n){
        Capacity =n;
        book = new String[Capacity];
    }

    public void printDetail(){
        System.out.println("Maximum Capacity: "+ Capacity);
        System.out.println("Total books "+ count);
        System.out.println("Book list: ");
        for (int i = 0; i < count; i++) {
            System.out.println(book[i]);
        }


    }
    public void addBook(String s){
        if(count < Capacity){
            book [count++] = s;
            System.out.println("Book '" + s +"' added to the library." );
        }
        else{
            System.out.println("Maximum capacity exceeds. You can't add more than "+Capacity +" books");
        }
        
        
        

    }


}

