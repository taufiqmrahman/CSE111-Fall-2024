public class Nokia extends Mobile {
    
    public double balance;
    public String country;

    public Nokia(String name, boolean sim, String imei, int balance){
        super(name,imei,sim);
        this.balance = balance;

    }

    public void rechargeSIMCard(int bal){
        this.balance += bal;
        System.out.println("Recharge successful! Current balance " +balance+ " TK.");
    }

    public String dialCall(String num){
        if(balance == 0){
            return "Insufficient balance! Please recharge.";
        }
        else if(!super.simCardStatus){
            return "No SIM card available! Please check the SIM card connectivity.";
        }
        else{ 
            String code1="";
            for (int i=0; i<3;i++){
                code1 += num.charAt(i);
            }
            if(code1.equals("880") || code1.equals("455")){
                country = super.getCountryName(code1);
                code1 = "";
                return "Dialing the number "+ num + " to "+ country + " region.";
            }
            else{
                code1 ="";
                return "Dialing is not allowed in this region.";
            }
            
            
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\nBalance: "+ this.balance;
    }


}
