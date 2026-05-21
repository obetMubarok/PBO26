package UJIANSUBCPMK3;
interface AudioControl{
    public void volumeNaik();
    public void volumeTurun();
}

class Playlist{
    private String nama;
    private int jumlahLagu;
    private String daftarLagu[];
    public Playlist(String nama, int size){
        this.nama = nama;
        daftarLagu = new String[size];
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlahLagu(int jumlahLagu) {
        this.jumlahLagu = jumlahLagu;
    }

    public void setDaftarLagu(String[] daftarLagu) {
        this.daftarLagu = daftarLagu;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahLagu() {
        return jumlahLagu;
    }

    public String[] getDaftarLagu() {
        return daftarLagu;
    }
    public void tambahLagu(String judul){
        daftarLagu[jumlahLagu] = judul;
        jumlahLagu++;
    }
}

class MediaPlayer extends Playlist implements AudioControl{
    private int volume;

    public MediaPlayer(String nama, int size) {
        super(nama, size);
    }

    @Override
    public void volumeNaik() {
        if(volume<10)
            volume++;
    }

    @Override
    public void volumeTurun() {
        if(volume > 0)
            volume--;
    }
    public void mute(){
        volume = 0;
    }
    public void info(){
        System.out.println("Volume saat ini adalah "+volume);
        System.out.println("Daftar lagu : ");
        for(int i=0; i<getJumlahLagu(); i++)
            System.out.println(getDaftarLagu()[i]);
    }
    
}
public class DemoJawaban {
    public static void main(String[] args) {
        MediaPlayer mp = new MediaPlayer("Playlist1", 10);
        mp.tambahLagu("judul1");
        mp.tambahLagu("judul2");
        mp.tambahLagu("judul3");
        mp.tambahLagu("judul4");
        mp.volumeNaik();
        mp.volumeNaik();
        
        mp.info();
    }
}
