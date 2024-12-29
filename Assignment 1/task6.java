//task6
import java.util.Scanner;
public class task6 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = s1.nextInt();
        int [] arr = new int[size];
        boolean [] arr1 = new boolean[size];
        int count ;
        int temp = arr[0];
        System.out.println("Enter elements: ");
        for (int inn=0; inn<size; inn++){
            arr[inn] = s1.nextInt();
        }
        for (int inn1 =0; inn1< size;inn1++){
            count =1;
            for (int x = (inn1+1); x< size; x++){
                if (arr[inn1]==arr[x]){
                    count++;
                    arr1[x]= true;   
                }
            }
            if(arr1[inn1]==false){
                temp = arr[inn1];
                System.out.println(temp+ " - "+ count+ " times.");
            }
            
        }
    }
}
