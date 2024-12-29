
public class BracuBus {
    public String route;
    public int capacity;
    public int passenger;
    public String [] names;
    public int count;

    public BracuBus(String route){
        this.route = route;
        this.capacity = 2;
        this.names = new String [capacity];
    }
    public BracuBus(String route, int cap){
        this.route = route;
        this.capacity = cap;
        this.names = new String [capacity];
        
    }

    public void showDetails(){
        System.out.println("Bus Route: "+ route);
        if (this.capacity==2){
            System.out.println("Passenger count: "+passenger +" (MAX:2)");
        }
        else{
            System.out.println("Passenger count: "+passenger +" (MAX:+" +capacity +")");
        }
        System.out.println("Passengers on board: ");
        for (int i =0; i<count;i++){
            System.out.print(names[i]+" ");
        }
        
    }

    public void board(){
        System.out.println("NO Passenger.");
        
    }
    public void board(BracuStudent obj){
        
        if(obj.pass == false){
            System.out.println("You don't have a bus pass!");
        }
        else if(obj.loc != route){
            System.out.println("You got on the wrong bus!");
        }
        else {
            if(count <capacity){
                names[count++] = obj.name;
                passenger++;
                System.out.println(obj.name + " boarded the bus.");
            }
            else{
                System.out.println("Bus is full!");
            }
        }
        
    }
    public void board(BracuStudent obj, BracuStudent obj2){
        board(obj);
        board(obj2);
    }
    



}
