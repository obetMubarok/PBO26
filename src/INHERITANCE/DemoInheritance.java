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
    
    private void info(){
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
    }
}
