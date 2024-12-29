//task3
import java.util.Scanner;
public class task3 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input 1: ");
        String one = s1.next();
        System.out.println("Input 2: ");
        String two = s1.next();
        String s2 =one +" "+ two;
        int sum =0;
        System.out.println(s2);
        for (int inn=0; inn<s2.length();inn++){
            if ((s2.charAt(inn)>='A'&& s2.charAt(inn)<='Z')||(s2.charAt(inn)>='a'&& s2.charAt(inn)<='z')){
                sum += (int)(s2.charAt(inn));
            }
        }
        System.out.println(sum);

    }
}
