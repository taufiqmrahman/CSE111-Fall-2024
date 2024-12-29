public class TaxiLagbe{
    
    public String number;
    public String area;
    public int total;
    public String list="" ;
    public int fare =0;
    public int count =0;
    public String name ="";

    public void printDetails(){
        System.out.println("Taxi number: "+ number);
        System.out.println("This taxi can cover "+ area + " area" );
        System.out.println("Total Passenger: "+ total);
        System.out.println("Passenger Lists: \n"+list);
        System.out.println("Total collected fare: "+fare + " taka");
    }
    public void storeInfo(String number, String area){
        this.number = number;
        this.area = area;
    }
    public void addPassenger(String name, int fare){
        
        if(count < 4){
            this.name =name;
            this.list += name + " ";
            this.fare += fare;
            System.out.println("Dear "+ name + "! Welcome to TaxiLagbe");
            total++;
            count++;
        }
        else{
            System.out.println("Taxi Full! No more passengers can be added");
        }   
    }
    public void addPassenger(String name ,int fare, String name1, int fare1){
        addPassenger(name, fare);
        addPassenger(name1, fare1);

    }


}