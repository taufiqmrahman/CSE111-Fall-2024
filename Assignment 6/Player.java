public class Player {
    
    public static int total =0;
    public String name;
    public String country;
    public int jersey;
    public static String players[]= new String[11];;

    public Player(String name, String country, int jersey){ 
        this.name = name;
        this.country = country;
        this.jersey = jersey;
        if(total<players.length){
            players[total++] = name;
        }
    }
    public String player_detail(){
        return "Player Name: " + name +"\nJersey Number: "+ jersey +"\nCountry: " + country;
    }
    public static void info(){
        if(total==0){
            System.out.println("Total number of players: "+total);
        }
        else{
            System.out.println("Total number of players: "+ total);
            System.out.print("Players enlisted so far: ");
            for(int i =0; i<total;i++){
                if(i==total-1){
                    System.out.print(players[i]);
                }
                else{
                    System.out.print(players[i]+ ", ");
                }
            }
            System.out.println();
        }
        
    }


}
