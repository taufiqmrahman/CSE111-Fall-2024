public class KKFlavouredTea extends KKTea {

    public KKFlavouredTea(String name, int price, int teabags){
        super(price, teabags);
        this.name = "KK "+name+" Tea";
    }
    public static void updateSoldStatusFlavoured(KKFlavouredTea obj){
        obj.status = true;
        totalSales++;
        flavourSold++;
    }
    
}
