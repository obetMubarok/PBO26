package INTERFACE;
interface Kendaraan{
    public void start();
    public void stop();
}

class Mobil implements Kendaraan{
    public void start() {
        System.out.println("mobil berjalan");
    }

    public void stop() {
        System.out.println("mobil berhenti");
    }
    
}
class Motor implements Kendaraan{

    public void start() {
        System.out.println("motor berjalan");
    }

    public void stop() {
        System.out.println("motor berhenti");
    }
    
}
public class NewClass {
    public static void main(String[] args) {
        Kendaraan k = new Mobil();
        k.start();
        k.stop();
        
        k = new Motor();
        k.start();
        k.stop();
    }
}
