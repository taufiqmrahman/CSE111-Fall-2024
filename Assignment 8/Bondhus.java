public class Bondhus extends SocialMedia{
    

    public int sentCount;
    public String [] sentBox = new String[5];

    public Bondhus(String name, String email){
        super(name, email);
    }

    public void sendMessage(String msg){
        if(sentCount <sentBox.length){
            sentBox[sentCount++] = msg;
        }
        else{
            System.out.println("Sent box is full.");
        }
    }
    public void showSentbox(){
        System.out.println(super.userName+ "'s Sentbox: ");
        if(sentCount==0){
            System.out.println("No sent messages.");
        }
        else{
            for (int i=0; i<sentCount;i++){
                System.out.println(sentBox[i]);
            }
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\nMessage Sent: "+ sentCount;
    }
}