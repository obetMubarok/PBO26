package CLASS;
class Nasabah{
    String nama;
    String noRek;
    double saldo;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

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
        saldo -= nominal;
    }
    public void setor(double nominal){
        saldo += nominal;
    }
    public void cekSaldo(){
        System.out.println("Saldo Rp "+saldo);
    }
}
public class DemoNasabahTanpaConstructor {
    public static void main(String[] args) {
        Nasabah n1 = new Nasabah();
        n1.setNama("Obet");
        n1.setNoRek("001");
        n1.setSaldo(500000);
        
        n1.setor(1000000);
        n1.tarikTunai(500000);
        n1.cekSaldo();
    }
    
}
