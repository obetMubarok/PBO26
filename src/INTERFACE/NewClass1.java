package INTERFACE;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class FrameSaya extends JFrame implements ActionListener{

    JButton button1 = new JButton("klik");
    JTextField field = new JTextField("");
    public FrameSaya() {
        //JFrame frame = new JFrame()
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        field.setSize(300, 100);
        
        add(field);
        add(button1);
        
        button1.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("anda telah tekan tombol");
    }
    
}
public class NewClass1 {
    public static void main(String[] args) {
        FrameSaya fs = new FrameSaya();
        fs.setVisible(true);
    }
}
