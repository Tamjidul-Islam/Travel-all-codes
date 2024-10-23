
package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class About extends JFrame implements ActionListener {

    

    public About() {
        
        setBounds(600, 200, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(200, 10, 100, 40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        add(l1);
        
        String s = "About the Travel Management System\n" +
                   "The Travel Management System** is a comprehensive application designed to streamline and enhance the travel planning and booking experience. Our goal is to provide users with a seamless interface for managing their travel itineraries, accommodations, and payments efficiently.\n\n" +
                   " Key Features:\n" +
                   "1. User-Friendly Interface: The application offers an intuitive design that makes it easy for users to navigate through various functionalities without any hassle.\n" +
                   "2. Booking Management: Users can easily search for and book hotels, flights, and other travel services tailored to their preferences and budget.\n" +
                   "3. Payment Integration: The system integrates with popular payment gateways, including bKash, to ensure secure and convenient payment processing for all transactions.\n" +
                   "4. Personalized Experience: Users can create profiles that allow for personalized travel recommendations based on previous bookings and preferences.\n" +
                   "5. Real-Time Updates: The application provides real-time updates on bookings, prices, and travel advisories, ensuring users have the latest information at their fingertips.\n" +
                   "6. Customer Support: Users have access to dedicated customer support to assist with any inquiries or issues that may arise during their travel planning process.\n\n" +
                   "Benefits:\n" +
                   "- Efficiency: Simplifies the travel planning process, saving users time and effort.\n" +
                   "- Cost-Effectiveness: Helps users find the best deals and prices, ensuring value for money.\n" +
                   "- Convenience: All travel-related tasks can be managed in one place, from booking to payment.\n" +
                   "- Enhanced Travel Experience: Provides users with tools and resources to make informed travel decisions.\n\n" +
                   "Whether you are planning a business trip, a family vacation, or an adventurous getaway, the Travel Management System is your go-to solution for all your travel needs.";

        
        TextArea area = new TextArea(s , 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);
        
       JButton back = new JButton("Back");
       back.setBounds(200, 420, 100, 25);
       back.addActionListener(this);
       add(back);
       
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }

    public static void main(String args[]) {
        new About();
    }

}
