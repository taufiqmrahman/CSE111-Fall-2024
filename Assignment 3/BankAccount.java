public class BankAccount {
    public int acc ;

    public String type =" Not Set";

    public String printDetails(){
        String s1 ="Account No: "+acc + "\n" +"Type: "+ type;
        return s1 ;

    }

    public void setInfo(int n, String s){
        acc =n;
        type =s;
        System.out.println("Account information updated.");
    }
}
