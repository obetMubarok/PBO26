package ABSTRACTCLASS;
abstract class Lingkaran3D{
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    abstract public double vol();
}

class Tabung extends Lingkaran3D{
    double tinggi;

    public Tabung(double tinggi) {
        this.tinggi = tinggi;
    }

    
    public double vol(){
        return 3.14 * radius * radius * tinggi;
    }
    
}
class Bola extends Lingkaran3D{

    @Override
    public double vol() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 4/3 * 3.14 * radius * radius;
    }
    
}
public class DemoAbstractClass {
    public static void main(String[] args) {
        Lingkaran3D l = new Tabung(5);
        l.setRadius(5);
        System.out.println(l.vol());
        
        l = new Bola();
        l.setRadius(7);
        System.out.println(l.vol());
        System.out.println(l.radius);
    }
}
