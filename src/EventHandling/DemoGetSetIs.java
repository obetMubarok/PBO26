package EventHandling;
class Label{
    private String text;
    private boolean selected;
    public String getText() {
        return text;
    }
    
    public void setSelected(boolean selected){
        this.selected = selected;
    }
    public boolean isSelected(){
        return selected;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
}


public class DemoGetSetIs {
    public static void main(String[] args) {
        Label l1 = new Label();
        l1.setText("Obet");//ubah
        System.out.println(l1.getText());//ambil
        
        if(!l1.isSelected()){//!false=true
            System.out.println("tampil"); 
        }
    }
}
