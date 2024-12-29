// task1
import java.util.Scanner;
public class task1 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        int sum = 0;
        double average = 0.0;
        int max=0;
        int min=0;
        int count =0;
        System.out.println("Input: ");
        for (int inn=1; inn<= 10; inn++){
            int num = s1.nextInt();
            if (count ==0){
                max =num;
                min = num;
            }
            if (num%2 != 0 && num>0){
                sum += num;
                count++;
                if (count!=0){
                    if(num>max){
                        max = num;
                    }
                    if (num<min){
                        min = num;
                    }
                }

            }
        }
        if (count !=0){
            double sum_double = sum;
            average = sum_double/count;
            System.out.println("Sum: "+ sum);
            System.out.println("Minimum: "+ min);
            System.out.println("Maximum: "+ max);
            System.out.println("Average: "+ average);
        }
        else {
            System.out.println("No odd positive numbers found.");
        }
        
    }
}
