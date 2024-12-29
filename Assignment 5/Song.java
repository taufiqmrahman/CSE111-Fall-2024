public class Song {
    public String name;
    public String artist;
    public int length;
    public Song next;

    public Song(String name,String artist, int length){
        this.name = name;
        this.artist= artist;
        this.length= length;

    }

    public void songInfo(){
        System.out.println("Title: "+ name);
        System.out.println("Artist: "+ artist);
        System.out.println("Length: "+ length +" minutes.");
    }
}
