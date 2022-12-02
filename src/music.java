public class music {
    String type;
    int songlength;
    String artist;

    public music(){
        type = "pop";
        songlength = 4;
        artist = "TaylorSwift";
        print();
    }
    public void print() {
        System.out.println("My favorite song by " +artist + " is so amazing");
        System.out.println("it is " + songlength + "minutes long and is considered to be " + type + "music");
    }
}

