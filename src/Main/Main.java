package Main;

public class Main {
    public static void main(String[] args){
        Colour a = new Colour("CYMK",200,100,150,30);
        Colour b = new Colour("RGB",200,100,150);
        System.out.println(Colour.equalColours(a,b));
    }

}
