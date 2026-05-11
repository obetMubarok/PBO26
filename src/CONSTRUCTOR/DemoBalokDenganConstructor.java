package CONSTRUCTOR;

class Balok{
    double panjang;
    double lebar;
    double tinggi;
    
    //constructor digunakan untuk memberikan nilai ke var panjang, lebar dan tinggi
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
        return panjang;//mengembalikan nilai panjang
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
public class DemoBalokDenganConstructor {
    public static void main(String[] args) {
        Balok balok1 = new Balok(5,6,7);
        System.out.println("Volume Balok1 : "+balok1.vol());
        
        Balok balok2 = new Balok(3,4,5);
        System.out.println("Volume Balok2 : "+balok2.vol());
    }
}
