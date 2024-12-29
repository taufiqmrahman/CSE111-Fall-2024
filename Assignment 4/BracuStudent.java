public class BracuStudent {
    public String name;
    public String loc;
    public boolean pass ;

    public BracuStudent(String name , String loc){
        this.name = name;
        this.loc =loc;

    }

    public void showDetails(){
        System.out.println("Student name: "+ name);
        System.out.println("Lives in "+ loc );
        System.out.println("Have Bus Pass? "+ pass);
    }
    public void getPass(){
        this.pass= true;
    }
    public void updateHome(String loc){
        this.loc = loc;
    }
}
