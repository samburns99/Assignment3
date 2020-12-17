package Main;

public class Main {
    public static void main(String[] args){
        Colour a = new Colour(10,100,10);
        Colour b = new Colour(200,100,150);
        System.out.println(Colour.equalColours(a,b));
        System.out.println(a.addColours(b));
        Colour c = new Colour(256,300,250);
        System.out.println(c.toString());
    }

}
