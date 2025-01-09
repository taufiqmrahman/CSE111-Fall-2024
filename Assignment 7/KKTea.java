public class KKTea extends Tea {
    
    public int weight;
    public int teaBags;
    public static int rkSales;
    public static int flavourSold;
    public static int totalSales;
    
    public KKTea(int price, int teabags){
        super("KK Regular Tea", price);
        teaBags = teabags;
        weight = teabags *2;
    }
    public static void updateSoldStatusRegular(KKTea obj){
        obj.status = true;
        rkSales++;
        totalSales++;
    }
    public void productDetail(){
        super.productDetail();
        System.out.println("Weight: " + weight + ", Tea Bags: " + teaBags);
        
    }
    public static void totalSales(){
        System.out.println("Total Sales: " + totalSales);
        System.out.println("KK Regular Tea: " + rkSales);
        if(flavourSold != 0){
            System.out.println("KK Flavoured Tea: " + flavourSold);
        }
    }
}
