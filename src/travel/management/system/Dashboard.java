package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonalDetails, viewPersonalDetails, UpdatePersonalDetails ,checkpackages, bookpackages ,viewpackages, viewhotels;
    JButton bookhotel, destinations,viewBookedHotel,payments,calculators,notepad,about, deletePersonalDetails;
    Dashboard(String username){
        this.username = username;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/home.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5, 0, 70, 70);
        p1.add(image);                                                                            
        
        JLabel heading = new JLabel ("Dashboard");
        heading.setBounds(90, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        addPersonalDetails = new JButton ("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setForeground(Color.BLACK);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        UpdatePersonalDetails = new JButton ("Update Personal Details");
        UpdatePersonalDetails.setBounds(0, 50, 300, 50);
        UpdatePersonalDetails.setForeground(Color.BLACK);
        UpdatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        UpdatePersonalDetails.setMargin(new Insets(0,0,0,30));
        UpdatePersonalDetails.addActionListener(this);
        p2.add(UpdatePersonalDetails);
        
        viewPersonalDetails = new JButton ("View Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setForeground(Color.BLACK);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton ("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.setForeground(Color.BLACK);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        checkpackages = new JButton ("Check Package");
        checkpackages.setBounds(0, 200, 300, 50);
        checkpackages.setForeground(Color.BLACK);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0,0,0,110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackages = new JButton ("Book Package");
        bookpackages.setBounds(0, 250, 300, 50);
        bookpackages.setForeground(Color.BLACK);
        bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackages.setMargin(new Insets(0,0,0,120));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);
        
        viewpackages = new JButton ("View Package");
        viewpackages.setBounds(0, 300, 300, 50);
        viewpackages.setForeground(Color.BLACK);
        viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackages.setMargin(new Insets(0,0,0,120));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);
        
        viewhotels = new JButton ("View Hotels");
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.setForeground(Color.BLACK);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotel = new JButton ("Book Hotel");
        bookhotel.setBounds(0, 400, 300, 50);
        bookhotel.setForeground(Color.BLACK);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewBookedHotel = new JButton ("View Booked Hotel");
        viewBookedHotel.setBounds(0, 450, 300, 50);
        viewBookedHotel.setForeground(Color.BLACK);
        viewBookedHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookedHotel.setMargin(new Insets(0,0,0,70));
        viewBookedHotel.addActionListener(this);
        p2.add(viewBookedHotel);
        
        destinations = new JButton ("Destinations");
        destinations.setBounds(0, 500, 300, 50);
        destinations.setForeground(Color.BLACK);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0,0,0,125));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payments = new JButton ("Payments");
        payments.setBounds(0, 550, 300, 50);
        payments.setForeground(Color.BLACK);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add(payments);
        
        calculators = new JButton ("Calculators");
        calculators.setBounds(0, 600, 300, 50);
        calculators.setForeground(Color.BLACK);
        calculators.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculators.setMargin(new Insets(0,0,0,145));
        calculators.addActionListener(this);
        p2.add(calculators);
        
        notepad = new JButton ("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setForeground(Color.BLACK);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton ("About");
        about.setBounds(0, 700, 300, 30);
        about.setForeground(Color.BLACK);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/dashbrd.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image1 = new JLabel(i6);
        image1.setBounds(0, 0, 1650, 1000);
        add(image1);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 70, 1000, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font ("Raleway", Font.PLAIN, 50));
        image1.add(text);
        
           
        setVisible(true);  
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails){
            new ViewCustomers(username);
        } else if (ae.getSource() == UpdatePersonalDetails){
            new UpdateCustomer(username);
        } else if (ae.getSource() ==  checkpackages){
            new CheckPackage();
        } else if (ae.getSource() ==  bookpackages){
            new BookPackage(username);
        } else if (ae.getSource() ==  viewpackages ) {
            new ViewPackage(username);
        }else if (ae.getSource() ==  viewhotels ) {
            new CheckHotels();
        } else if (ae.getSource() ==  destinations ) {
            new Destinations();
        } else if (ae.getSource() == bookhotel) {
            new BookHotel(username);
        } else if (ae.getSource() == viewBookedHotel) {
            new ViewBookedHotel(username);
        } else if (ae.getSource() == payments) {
            new Payment();
        } else if (ae.getSource() == calculators) {
              try {
                  Runtime.getRuntime().exec("calc.exe");
                  
              } catch (Exception e) {  
                  e.printStackTrace();
              }
        } else if (ae.getSource() ==  notepad) {
              try {
                  Runtime.getRuntime().exec("notepad.exe");
                  
              } catch (Exception e) {  
                  e.printStackTrace();
              }
        } else if (ae.getSource() == about ) {
            new About();
        } else if (ae.getSource() == deletePersonalDetails) {
            new DeleteDetails(username);
        }
        
    }
    
    public static void main (String [] args){
        new Dashboard(""); 
    }
}
