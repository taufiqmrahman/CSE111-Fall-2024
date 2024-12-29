//task1
public class UniversityTester{
    public static void main(String [] args){
        //a
        University s1 = new University();
        University s2= new University();

        System.out.println(s1);
        System.out.println(s2);
        //b

        System.out.println("NAME: " +s1.name+ ", COUNTRY: "+ s1.country);
        System.out.println("NAME: " +s2.name+ ", COUNTRY: "+ s2.country);

        s1.name =  "Imperial College London";
        s1.country = "England";

        s2.name =  "Brac University";
        s2.country =  "Bangladesh";

        System.out.println("NAME: " +s1.name+ ", COUNTRY: "+ s1.country);
        System.out.println("NAME: " +s2.name+ ", COUNTRY: "+ s2.country);

        

    }
}