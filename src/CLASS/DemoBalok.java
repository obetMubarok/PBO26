package CLASS;
class Balok{
    double panjang;
    double lebar;
    double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }
    
    public double vol(){
        return panjang * lebar * tinggi;
    }
    
    
}
public class DemoBalok {
    public static void main(String[] args) {
        Balok balok1 = new Balok(6, 7, 5);
        System.out.println(balok1.vol());
        
        Balok balok2 = new Balok(5, 6, 4);
        System.out.println(balok2.vol());
    }
}
