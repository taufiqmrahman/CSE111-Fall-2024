//task9
public class task9 {
    public static void main(String [] args){
        int [ ] [ ] A = {{1, 0, 0},
                        {0, 1, 0},
                        {0, 0, 1}};
        int row = A.length;
        int col = A[0].length;
        boolean check = false;
        if (row != col){
            System.out.println("Not an Identity Matrix.");
        }
        else{
            for (int i=0; i<row; i++){
                for (int j=0; j<row; j++){
                    if(i==j && A[i][j] == 1){
                        check = true;
                    }
                    else if(i!=j && A[i][j] == 0){
                        check = true;
                    }
                    else {
                        check = false;
                        break;
                    }
                }
            }
            if(check==true){    
                System.out.println("Identity Matrix.");
            }
            else{
                System.out.println("Not an Identity Matrix.");
            }
        }
        
        

    }
}
