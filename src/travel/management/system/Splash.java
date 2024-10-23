package travel.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon; 

public class Splash extends JFrame implements Runnable {
    Thread thread;

    Splash (){
        setSize(1200, 600);
        setLocation(200, 100);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        //image.setBounds(5, 0, 70, 70);
        add(image);
        
        setVisible(true);
        thread = new Thread(this);
        thread.start();
 }
    
    public void run () {
          try{
              Thread.sleep(5000);
              new Login(); 
              setVisible(false);
          } catch(Exception e) {
              
          }   
    }

    public static void main(String[] args){
        Splash frame = new Splash();
        
        
       int x = 1;
        for(int i = 1; i <= 500; x+=7, i+=6) {
           frame.setLocation(750 - (x + i)/2, 400 - (i/2));
           frame.setSize(x + i, i);
           
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                
            }
            
        }
    }  
        
}
