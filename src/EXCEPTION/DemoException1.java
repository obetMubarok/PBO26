package EXCEPTION;

public class DemoException1 {
    public static void main(String[] args) {
        try {
            //int nilai = 9/0;
            //int data = Integer.parseInt("89");
            int[] data = {1,2,3,5,8};
            System.out.println(data[2]);
        } catch (ArithmeticException e) {
            System.out.println("terjadi pembagian 0");
        } catch (NumberFormatException e){
            System.out.println("terjadi ex number salah");
        } catch (IndexOutOfBoundsException e ){
            System.out.println("index keluar batas");
        } finally{
            System.out.println("selesai");
        }
    }
}
