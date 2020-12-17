package Main;

public class Colour {
    private String type;
    private int w;
    private int x;
    private int y;
    private int z;

    public Colour(int r, int g, int b) {
        this.type = "RGB";
        this.w = r;
        this.x = g;
        this.y = b;
        limitInputsRGBW();
        limitInputsRGBX();
        limitInputsRGBY();
    }

    public Colour(String type, int c, int m, int y, int k) {
        this.type = type;
        this.w = c;
        this.x = m;
        this.y = y;
        this.z = k;
        limitInputsCMYKw();
        limitInputsCMYKx();
        limitInputsCMYKy();
        limitInputsCMYKz();
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

    public void limitInputsCMYKw() {
        if (this.w >= 100) {
            this.w = 100;
        } else if (this.w < 0) {
            this.w = 0;
        }
    }
    public void limitInputsCMYKx() {
        if (this.x >= 100) {
            this.x = 100;
        } else if (this.x < 0) {
            this.x = 0;
        }
    }
    public void limitInputsCMYKy() {
        if (this.y >= 100) {
            this.y = 100;
        } else if (this.y < 0) {
            this.y = 0;
        }
    }
    public void limitInputsCMYKz() {
        if (this.z >= 100) {
            this.z = 100;
        } else if (this.z < 0) {
            this.z = 0;
        }
    }

    public int getFirstComponent(){
        return this.w;
    }
    public int getSecondComponent(){
        return this.x;
    }
    public int getThirdComponent(){
        return this.y;
    }
    public int getFourthComponent(){
        return this.z;
    }

    public static boolean equalColours(Colour a, Colour b) {
        if (a.type.equals("CMYK")) {
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
        else if (a.type.equals("RGB")) {
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


    public Object addColours(Colour a) {
        if (a.type.equals("RGB")) {
            if ((a.w + this.w) <= 255) {
                if ((a.x + this.x) <= 255) {
                    if ((a.y + this.y) <= 255) {
                        Colour colour1 = new Colour((a.w + this.w), (a.x + this.x), (a.y + this.y));
                        return colour1;
                    }
                }
            }
        }
        else if (a.type.equals("CMYK")) {
                if ((a.w + this.w) <= 100) {
                    if ((a.x + this.x) <= 100) {
                        if ((a.y + this.y) <= 100) {
                            if ((a.z + this.z) <= 100) {
                                Colour colour1 = new Colour("CMYK", (a.w + this.w), (a.x + this.x), (a.y + this.y), (a.z + this.z));
                                return colour1;
                        }
                    }
                }
            }
        }
        return "These colours can't be added";
    }

    public String toString() {
        if (this.type.equals("RGB")){
            return String.format("Colour: Type -> RGB, R = %d, G = %d, B = %d", w, x, y);
        }
        return String.format("Colour: Type -> CMYK, C = %d, M = %d, Y = %d, k = %d", w, x, y,z);
    }
}



