//task2
import java.util.Scanner;
public class task2 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first integer number: ");
        int n1 = s1.nextInt();
        System.out.println("Enter second integer number: ");
        int n2 = s1.nextInt();
        int count =0;

        if(n1<n2){
            for (int inn = n1; inn<= n2;inn++){
                if(prime(inn)==true){
                    count++;
                }
            }
        }
        else if(n1>n2){
            for (int inn = n1; inn>=n2;inn--){
                if(prime(inn)==true){
                    count++;
                }
            }
        }
        System.out.println("There are "+count+" prime numbers between "+n1+" and "+ n2);
        
    }

    public static boolean prime(int n){
        int count =0;
        for (int inn=1; inn<=n; inn++){
            if (n%inn==0){
                count++;
            }
        }
        if (count==2){
            return true;
        }
        else{
            return false;
        }
    }
}
