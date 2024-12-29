//task7
import java.util.Scanner;
public class task7 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = s1.nextInt();
        double [] arr = new double[size];
        int count = 0;
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i< size; i++){
            arr[i] = s1.nextDouble();
        }
        //[5.2,2.7,1.0,1.0,2.7,3.5,3.5,3.5]
        double [] temp = new double[size];
        temp[0] = arr[0];
        int counter =1;
        for (int loop =1; loop<size; loop++){
            if(arr[loop-1]!= arr[loop]){
                temp[counter++] = arr[loop];
            }
            else{
                count++;
            }
        }
        double ans[] = new double[counter];
        for(int i=0; i<counter; i++){
            ans[i] = temp[i];
        }

        System.out.print("New Array: ");
        for (int loop =0; loop<counter; loop++){
            System.out.print(ans[loop] + " ");
        }
        System.out.println();
        System.out.println("Removed elements : " + count);
    }
}
