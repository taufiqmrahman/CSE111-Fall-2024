public class Passenger {
    
    public static int no_of_passenger;
    public static double total_fare;
    public String name;
    public double distance;
    public double fare;
    
    public Passenger(String name, double distance){
        this.name = name;
        this.fare = 20.0*distance;
        total_fare += this.fare;
        no_of_passenger++;
    }
    public void passengerDetails(){
        System.out.println("Name: "+ this.name);
        System.out.println("Fare: "+ this.fare);
    }
    public void storeBaggageWeight(double baggage){
        double extra_fare = baggage * 10;
        this.fare += extra_fare;
        total_fare += extra_fare;
    }
}
