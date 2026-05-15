package CLASS;
class Balok{
    double panjang;
    double lebar;
    double tinggi;
    
    //method set untuk memberikan nilai ke var
    //method get untuk mengambil nilai sebuah var
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
public class DemoBalokTapaConstructor {
    public static void main(String[] args) {
        Balok balok1 = new Balok();
        balok1.setPanjang(6);
        balok1.setLebar(7);
        balok1.setTinggi(5);
        System.out.println("Volume Balok1 : "+balok1.vol());
        
        Balok balok2 = new Balok();
        balok2.setPanjang(5);
        balok2.setLebar(6);
        balok2.setTinggi(4);
        System.out.println("Volume Balok2 : "+balok2.vol());
    }
}
