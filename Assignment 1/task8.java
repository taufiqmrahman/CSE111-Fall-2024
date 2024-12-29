// task8
import java.util.Scanner;
public class task8 {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number of row: ");
        int row = s1.nextInt();
        System.out.println("Enter number of column: ");
        int col = s1.nextInt();
        int [][] arr1 = new int [row][col];
        int [] arr2 = new int [row*col];
        System.out.println("Enter the elements of array: ");
        for (int inn =0; inn<row; inn++){
            for (int inn1 =0; inn1<col; inn1++){
                arr1[inn][inn1] = s1.nextInt();
            }
        }
        System.out.println("2D Array: ");
        for (int x =0; x< row;x++){
            for (int j =0; j<col; j++){
                System.out.print(arr1[x][j]+" ");
                if (j == (col-1)){
                    System.out.println();    
                }
            }
        }
        int num = 0;
        for (int i =0; i<row; i++){
            for (int j =0; j<col; j++){
                arr2[num++] = arr1[i][j];
            }
        }
        System.out.println("1D Array: ");
        for (int x =0; x< (row*col);x++){
            System.out.print(arr2[x]+" ");
        }
        
    }
}
