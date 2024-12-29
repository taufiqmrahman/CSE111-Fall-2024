//task5
import java.util.Scanner;
public class task5 {
    public static void main(String [] args){
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int size = s1.nextInt();
        System.out.println("Enter the elements of the array: ");
        int [] arr = new int [size];
        for (int inn=0; inn<size;inn++){
            arr[inn]= s1.nextInt();
        }
        
        for (int inn1=0; inn1< size/2;inn1++){
            int temp = arr[inn1];
            arr[inn1] = arr[size-inn1-1];
            arr[size-inn1-1] = temp;
        }
        System.out.print("Reversed array : ");
        for (int x =0; x<size; x++){
            System.out.print(arr[x]+" ");
        }
    }
}
