public class Playlist {
    public String name;
    public Song start;

    public Playlist(String name){
        this.name=name;
        System.out.println(name+" created.");
        
    }

    public void addSong(Song song){
        if(start== null){
            start= song;
            System.out.println(start.name + " added to "+ name);
        }
        else{
            Song current = start;
            while(current.next!=null){
                current= current.next;     
            }
            current.next =song;
            System.out.println(current.next.name + " added to "+ name);  
            
        }    
    }
    
    public void addSong(Song song, int idx) {
        if (idx == 0){
            song.next = this.start;
            this.start = song;
            System.out.println(song.name + " added to " + name);
        } 
        else {
            Song current = start;
            int i = 0;
            while (i < idx - 1 && current != null){
                current = current.next;
                i++;
            }
            if (current == null) {
                System.out.println("Cannot add song to Index " + idx);
            } 
            else {
                song.next = current.next;
                current.next = song;
                System.out.println(song.name + " added to " + name);
            }
        }
    }

    public void info(){
        System.out.println(name + " has the following Songs:");
        if(start ==null){
            System.out.println("No songs in "+ name);
        }
        else{
            Song current = start;
            int index =1;
            while(current!= null){
                System.out.println("Song-"+ index++);
                current.songInfo();
                current = current.next;
            }
        }
        
    }

    public void playSong(String name) {
        Song current = start;
        boolean found = false;
        while (current != null) {
            if (current.name.equals(name)) {
                System.out.println("Playing " + current.name + " by " + current.artist + ".");
                found = true;
                break;
            }
            current = current.next;
        }
        if (found==false) {
            System.out.println(name + " not found in " + this.name);
        }
    }

    public void playSong(int idx){
        Song current = start;
        int i = 0;
        boolean found = false;
        while (current != null) {
            if (i == idx) {
                System.out.println("Playing " + current.name + " by " + current.artist + ".");
                found = true;
                break;
            }
            current = current.next;
            i++;
        }
        if (found == false) {
            System.out.println("Song at Index " + idx + " not found in " + this.name+".");
        }
    }

    public void deleteSong(String song){
        if(start != null && start.name.equals(song)){
            start = start.next;
            System.out.println(song + " deleted from " + name);
        }
        else{
            Song current = start;
            while(current.next != null && !current.next.name.equals(song)){
                current = current.next;
            }
            if(current.next == null){
                System.out.println(song + " not found in " + name);
            } 
            else {
                current.next = current.next.next;
                System.out.println(song + " deleted from " + name);
            }
        }
    }

    public int totalSong(){
        int count = 0;
        Song current = start;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void merge(Playlist playlist){
        if(playlist.start != null){
            if(start == null){
                start = playlist.start;
            } else {
                Song current = start;
                while(current.next != null){
                    current = current.next;
                }
                current.next = playlist.start;
            }
            System.out.println("Merge Completed!");
        }
    }

    
}
