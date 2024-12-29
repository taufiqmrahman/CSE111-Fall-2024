//task7
public class CellPhone {
    public String model = "unknown";
    public int count = 0;
    public String arr [] = new String[3];


    public void storeContact(String s1){   
        if(count<arr.length){
            arr[count++] = s1;
            System.out.println("Contacts stored.");
        }
        else{
            System.out.println("Memory full. New contact can't be stored.");
        }
           
    }

    public void printDetails(){
        System.out.println("Phone Model "+ model); 
        System.out.println("Contacts Stored "+ count);
        if(count>0){
            System.out.println("Stored Contacts: ");
        for (int i=0; i<count;i++){
            System.out.println(arr[i]);
        }
        if (count>3){
            System.out.println("Memory full. New contact can't be stored.");
        }
        }
        
    }

   
}
