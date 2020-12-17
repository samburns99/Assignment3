package Main;

public class Colour {
    private String type;
    private int w;
    private int x;
    private int y;

    public Colour(int r, int g, int b) {
        this.type = "RGB";
        this.w = r;
        this.x = g;
        this.y = b;
        limitInputsRGBW();
        limitInputsRGBX();
        limitInputsRGBY();
    }

    public Colour(int r, int g, int b, String type) {
        this.type = type;
        this.w = r;
        this.x = g;
        this.y = b;
        limitInputsRGBW();
        limitInputsRGBX();
        limitInputsRGBY();
    }


    public void limitInputsRGBW() {
        if (this.w >= 255) {
            this.w = 255;
        } else if (this.w < 0) {
            this.w = 0;
        }
    }

    public void limitInputsRGBX() {
        if (this.x >= 255) {
            this.x = 255;
        } else if (this.x < 0) {
            this.x = 0;
        }
    }

    public void limitInputsRGBY() {
        if (this.y >= 255) {
            this.y = 255;
        } else if (this.y < 0) {
            this.y = 0;
        }
    }

    public int getFirstComponent() {
        return this.w;
    }

    public int getSecondComponent() {
        return this.x;
    }

    public int getThirdComponent() {
        return this.y;
    }

    public static boolean equalColours(Colour a, Colour b) {
        if (a.type.equals(b.type)) {
            if (a.w == b.w && a.x == b.x && a.y == b.y) {
                return true;
            }
            return false;
        }
        return false;
    }


    public Object addColours(Colour a) {
        if (a.type.equals(this.type)) {
            return new Colour((a.w + this.w), (a.x + this.x), (a.y + this.y),(a.type));
        }
        return "These colours can't be added";
    }

    public String toString() {
        return String.format("Colour: Type -> %s, R = %d, G = %d, B = %d", type,w, x, y);
    }
}




