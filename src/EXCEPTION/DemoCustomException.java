package EXCEPTION;
class SaldoTidakCukupException extends Exception{
    public SaldoTidakCukupException(String message){
        super(message);
    }
}

class RekeningBank{
    double saldo;

    public RekeningBank(double saldo) {
        this.saldo = saldo;
    }
    public void tarikTunai(double jumlah) throws SaldoTidakCukupException{
        if(jumlah>saldo){
            throw new SaldoTidakCukupException("Transaksi gagal");
        }else if(jumlah == 0){
            throw new IllegalArgumentException("tidak boleh nol");
        }
        saldo -= jumlah;
    }
}

public class DemoCustomException {
    public static void main(String[] args) throws ArithmeticException{
        RekeningBank rb = new RekeningBank(500000);
        try {
            //rb.tarikTunai(0);
            rb.tarikTunai(1000000);
        } catch (SaldoTidakCukupException e) {
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}