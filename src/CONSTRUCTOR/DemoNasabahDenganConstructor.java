package CONSTRUCTOR;

import CLASS.*;

class Nasabah{
    String nama;
    String noRek;
    double saldo;

    //construsctor digunakan untuk memberikan nilai ke variabel nama, norek dan saldo
    public Nasabah(String nama, String noRek, double saldo) {
        this.nama = nama;
        this.noRek = noRek;
        this.saldo = saldo;
    }
    
    //method set digunakan untuk mengubah nilai variabel
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //method get digunakan untuk ambil nilai dari variabel
    public String getNama() {
        return nama;
    }

    public String getNoRek() {
        return noRek;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void tarikTunai(double nominal){
        saldo -= nominal;//mengurangi saldo
    }
    public void setor(double nominal){
        saldo += nominal;//menambah saldo
    }
    public void cekSaldo(){
        System.out.println("Saldo Rp "+saldo);
    }
}
public class DemoNasabahDenganConstructor {
    public static void main(String[] args) {
        Nasabah n1 = new Nasabah("Obet", "001", 500000);
        
        n1.setor(1000000);
        n1.tarikTunai(500000);
        n1.cekSaldo();
    }
    
}
