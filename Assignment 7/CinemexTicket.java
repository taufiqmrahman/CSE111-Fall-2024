public class CinemexTicket extends MovieTicket {
    
    private static int total_tickets;
    public String genre;
    public boolean paid;
    public String ticket_id;
    public String time1[];
    public int time2;

    public CinemexTicket(String movie, String time, String genre, String date){
        super(movie, date,time, seatPrices[0]);
        super.seat = seatTypes[0];
        this.genre = genre;
        this.paid = false;
        time1 = time.split(":");
        time2 = Integer.parseInt(time1[0]) * 100 + Integer.parseInt(time1[1]);
        total_tickets++;
        ticket_id = movie +"-"+ seatTypes[0].charAt(0)+"-"+total_tickets;
        
    }
    public CinemexTicket(String movie, String time, String genre, String date, String seat){
        super(movie, date,time, 0.0);
        for (int i = 0; i < seatTypes.length; i++) {
            if (seatTypes[i].equals(seat)) {
                setPrice(seatPrices[i]);
                break;
            }
        }
        super.seat = seat;
        this.genre = genre;
        this.paid = false;
        this.time1 = time.split(":");
        this.time2 = Integer.parseInt(time1[0]) * 100 + Integer.parseInt(time1[1]);
        total_tickets++;
        this.ticket_id = movie +"-"+ seat.charAt(0) +"-"+ total_tickets;

    }

    public static int getTotalTickets(){
        return total_tickets;
    }

    public void calculateTicketPrice(){
        double price = getPrice();
        if (time2 >= 1800 && time2 <= 2300) {
            price += price * nightShowCharge / 100.0; 
        }
        setPrice(price);
        System.out.println("Ticket price is calculated successfully.");
    }

    public String confirmPayment(){
        if (!this.paid) {
            this.paid = true;
            return "Payment Successful.";
        }
        else {
            return "Ticket price is already paid!";
        }
    }

    @Override
    public String toString(){
        if(paid ==true){
            return "Ticket ID: " + this.ticket_id + "\n" +
               super.toString() + "\n" +
               "Genre: " + this.genre + "\n" +
               "Seat Type: " + super.seat + "\n" +
               "Price(tk): " + getPrice() + "\n" +
               "Status: " + "Paid";
        }
        else{
            return "Ticket ID: " + this.ticket_id + "\n" +
               super.toString() + "\n" +
               "Genre: " + this.genre + "\n" +
               "Seat Type: " + super.seat + "\n" +
               "Price(tk): " + getPrice() + "\n" +
               "Status: " + "Not Paid";
        }
        
    }
}
