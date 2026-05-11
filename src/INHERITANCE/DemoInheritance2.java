package INHERITANCE;
class BangunDatar{
    String warna;
    public BangunDatar(String warna){
        this.warna = warna;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
}
class Persegi extends BangunDatar{
    double sisi;
    
    //karena pada superclass terdapat constructor, maka
    //subclass wajib super pada var yang ada di constructor superclass
    public Persegi(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }
    

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }
    public double luas(){
        return sisi*sisi;
    }
}
//karena pada superclass terdapat constructor, maka
//subclass wajib super pada var yang ada di constructor superclass
class Lingkaran extends BangunDatar{
    double radius;
    public Lingkaran(double radius, String warna){
        super(warna);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double luas(){
        return 3.14 * radius * radius;
    }
}
public class DemoInheritance2 {
    public static void main(String[] args) {
        Lingkaran r1 = new Lingkaran(5, "Merah");
        System.out.println(r1.luas());
        
        Persegi p1 = new Persegi(6, "Kuning");
        System.out.println(p1.luas());
        
    }
}
