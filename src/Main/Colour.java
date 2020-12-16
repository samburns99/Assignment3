package Main;

public class Colour {
    private String type;
    private int r;
    private int g;
    private int b;

    public Colour(String type, int r, int g, int b) {
        this.type = type;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public static boolean equalColours(Colour colour1, Colour colour2) {
        return true;
    }
}
