//task4
import java.util.Scanner;
public class task4 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input: ");
        String s2 = s1.next();
        String ans = "";

        for (int inn = 0; inn< s2.length();inn++){
            if((s2.charAt(inn)>='A'&&s2.charAt(inn)<='Z')||(s2.charAt(inn)>='a'&&s2.charAt(inn)<='z')){
                if(s2.charAt(inn)=='A'||s2.charAt(inn)=='a'){
                    ans += (char)(s2.charAt(inn)+25) ;
                }
                else{
                    ans += (char)(s2.charAt(inn)-1);
                }
            }
        }
        System.out.println(ans);
    }
}
