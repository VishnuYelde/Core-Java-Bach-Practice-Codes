import java.util.TreeSet;

public class ComparableEg1 {
    public static void main(String[] args) {
        Songs s1 = new Songs("Sundari", "Sanju Rathod", 2.50);
        Songs s2 = new Songs("Teri Jhuki Nazar", "Shafqat Amanat Ali", 4.39);
        Songs s3 = new Songs("O Meri Jaan", "KK", 5.06);
        Songs s4 = new Songs("Tu Jaane Na", "Atif Aslam", 5.42);

        TreeSet<Songs> songSet = new TreeSet<Songs>();
        songSet.add(s1);
        songSet.add(s2);
        songSet.add(s3);
        songSet.add(s4);

        System.out.println(songSet);
        System.out.println("---------------------------");
        for (Songs songs : songSet) {
            System.out.println(songs);
        }
    }    
}

class Songs implements Comparable<Songs>{

    String title;
    String artist;
    double duration;

    public Songs(String title, String artist, double duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String toString(){
        return "Title: "+title+" Artist: "+artist+" Duration: "+duration;
    }


    //! Sorting based on Title
    // public int compareTo(Songs s){
    //     return this.title.compareTo(s.title);
    // }

    //! Sorting based on Duration
    public int compareTo(Songs s){
        return Double.compare(this.duration, s.duration);
    }

}
