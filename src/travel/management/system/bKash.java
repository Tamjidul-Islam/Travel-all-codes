package travel.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class bKash extends JFrame implements ActionListener {
    
    bKash(){
       
        setBounds(500, 200, 800, 600);
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        
        try {
            pane.setPage("https://www.bKash.com/rent-payment");
        } catch (Exception e) {
            pane.setContentType("text/html");
            pane.setText("<html>Could not Load,Error 404</html>");
        }
        
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        
       JButton back = new JButton("Back");
       back.setBounds(350, 20, 80, 40);
       back.addActionListener(this);
       pane.add(back);
       
         setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Payment() ;
    }

    
    public static void main(String[] args){
        new bKash();
    }
}