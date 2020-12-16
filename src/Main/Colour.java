package Main;

public class Colour {
    private String type;
    private int w;
    private int x;
    private int y;
    private int z;

    public Colour(String type, int r, int g, int b) {
        this.type = type;
        this.w = r;
        this.x = g;
        this.y = b;
    }

    public Colour(String type, int c, int m, int y, int k) {
        this.type = type;
        this.w = c;
        this.x = m;
        this.y = y;
        this.z = k;

    }
    public static boolean equalColours(Colour a, Colour b) {
        if (a.type == "CMYK") {
            if (a.type.equals(b.type)) {
                if (a.w == b.w) {
                    if (a.x == b.x) {
                        if (a.y == b.y) {
                            if (a.z == b.z) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        if (a.type == "RGB") {
            if (a.type.equals(b.type)) {
                if (a.w == b.w) {
                    if (a.x == b.x) {
                        if (a.y == b.y) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }


    public Colour addColours(Colour a){
        if (a.type == "RGB"){
            if ((a.w+this.w)<= 255){
                if ((a.x+this.x)<=255){
                    if ((a.y+this.y)<= 255){
                        Colour colour1 = new Colour("RGB",(a.w+this.w),(a.x+this.x),(a.y+this.y));
                        return colour1;
                    }
                }
            }
        }return a;
    }


