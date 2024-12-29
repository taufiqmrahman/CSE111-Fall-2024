public class Reader{
    public String name;
    public int capacity;
    public String [] books;
    public int count =0;

    public String createReader(String s, int n){
        name =s;
        capacity =n;
        books= new String [capacity];
        return "A new reader is created." ;
        

    }

    public void readerInfo(){
        System.out.println("Name: "+name);
        System.out.println("Capacity: "+capacity);
        if(count==0){
            System.out.println("Books: \nNo books added.");
            
        }
        else{
            System.out.println("Books:");
            for (int i=0; i<count;i++){
                System.out.println("Book "+(i+1)+": "+ books[i]);
            }
        }
        

    }

    public void addBook(String s){
        if(count<capacity){
            books[count++] = s;
        }
        else{
            System.out.println("No more capacity.");
        }
        

    }
}