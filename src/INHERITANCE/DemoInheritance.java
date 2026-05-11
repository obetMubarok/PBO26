package INHERITANCE;
class Karyawan{
    String nama;
    String id;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void info(){
        System.out.println("Nama : "+nama);
        System.out.println("ID   : "+id);
    }
}
class Dosen extends Karyawan{
    public void mengajar(){
        System.out.println("mengajar");
    }
}
class Satpam extends Karyawan{
    public void jaga(){
        System.out.println("Menjaga");
    }
    
}
class Admin extends Karyawan{
    public void melayani(){
        System.out.println("Melayani");
    }
}

public class DemoInheritance {
    public static void main(String[] args) {
        Dosen d1 = new Dosen();
        d1.setId("D001");
        d1.setNama("Obet");
        d1.info();
        System.out.println("====================");
        
        Satpam s1 = new Satpam();
        s1.setId("S001");
        s1.setNama("Budi");
        s1.info();
    }
}
