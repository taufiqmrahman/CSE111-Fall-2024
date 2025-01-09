public class Vaccine {
    
    private String vaccine;
    private String country;
    private int days;

    public Vaccine(String vaccine, String country, int days){
        this.vaccine = vaccine;
        this.country = country;
        this.days= days;
    }

    public String getVaccine(){
        return this.vaccine;
    }
    
    public int getDays(){
        return this.days;
    }

}