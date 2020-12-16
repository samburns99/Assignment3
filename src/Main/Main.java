package Main;

public class Main {
    public static void main(String[] args){
        Colour a = new Colour("RGB",10,100,10);
        Colour b = new Colour("RGB",200,100,150);
        System.out.println(Colour.equalColours(a,b));
        System.out.println(Colour.addColours(a,b));

    }

}
