public class Dubstep {
    public static String SongDecoder(String song) {
        String s = song;
        s = s.replaceAll("WUB", " ").replaceAll("\\s+", " ");
        return s.trim();
    }
}
