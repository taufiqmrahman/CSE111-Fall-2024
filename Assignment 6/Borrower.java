public class Borrower{
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    public String name;
    public String[] borrowedBooks;
    public int count;
  
    // Your Code here
    public Borrower(String name){
      this.name = name;
      this.borrowedBooks = new String[book_name.length];
    }

    public void borrowBook(String book){
      for (int i = 0; i<book_name.length;i++){
        if (book_name[i].equals(book)){
          if (book_count[i]>0){
            book_count[i]--;
            borrowedBooks[count++] = book;
          }
          else{
            System.out.println("This book is not available.");
          }
        }
      }
    }
    public static void bookStatus(){
      System.out.println("Available Books: ");
      for (int i =0; i<book_count.length;i++){
        System.out.println(book_name[i]+": "+book_count[i]);
      }
    }
    public void borrowerDetails() {
      System.out.println("Name: " + name);
      System.out.println("Books Borrowed: ");
      for (int i = 0; i < count; i++) {
          System.out.println(borrowedBooks[i]);
      }
  }
    public static int remainingBooks(String book){
      for (int i = 0; i<book_name.length;i++){
        if (book_name[i].equals(book)){
          return book_count[i];
        }
      }
      return 0;
    }
    
  }
  