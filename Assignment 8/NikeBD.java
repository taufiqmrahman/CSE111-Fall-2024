

public class NikeBD{

    public String area;
    public static int branches;
    public static String [] products = {"Jordan","Cortez","Kobe"};
    public static int [] qty = {0,0,0};
    public String [] products1 = {"Jordan","Cortez","Kobe"};
    public int [] qty1 = {0,0,0};
    public static int sold;
    public int sold1;

    public NikeBD(String area){
        this.area =area;
        branches++;
    }

    public void restockProducts(String name, int quantity){
        for(int i=0; i<qty1.length;i++){
            if(products1[i].equals(name)){
                qty1[i] += quantity ;
                qty[i] += quantity;
            }
        }
    }

    public void restockProducts(String [] products, int [] qty){
        for (int i=0;i<qty1.length;i++){
            if(products1[i].equals(products1[i])){
                this.qty1[i] += qty[i];
                NikeBD.qty[i] += qty[i];
            }
        }
    }

    public void productSold(String name, int qty, String name2, int qty2){
        for (int i=0; i<NikeBD.qty.length;i++){
            if(products1[i].equals(name)){
                this.qty1[i] -= qty;
                NikeBD.qty[i] -= qty;
                sold += qty;
                sold1 += qty;
            }
        }
        for (int i=0; i<NikeBD.qty.length;i++){
            if(products1[i].equals(name2)){
                this.qty1[i] -= qty2;
                NikeBD.qty[i] -= qty2;
                sold += qty2;
                sold1 += qty2;
            }
        }
    }

    public void details(){
        System.out.println("Nike "+ this.area + " outlet: ");
        System.out.print("Products currently stocked: ");
        for (int i=0;i <qty.length;i++){
            if(i==2){
                System.out.print(products1[i]+": "+ qty1[i]);
            }
            else{
                System.out.print(products1[i]+": "+ qty1[i]+", ");
            }
        }
        System.out.println();
        System.out.println("Sold: "+ sold1);
    }
    public static void status(){
        System.out.println("Nike Bangladesh Status: ");
        System.out.println("Branches Opened: "+ NikeBD.branches);
        System.out.print("Currently stocked: ");
        for (int i=0;i <qty.length;i++){
            if(i==2){
                System.out.print(products[i]+": "+ qty[i]);
            }
            else{
                System.out.print(products[i]+": "+ qty[i]+", ");
            }
        }
        System.out.println();
        System.out.println("Sold: "+ NikeBD.sold);


    }

}