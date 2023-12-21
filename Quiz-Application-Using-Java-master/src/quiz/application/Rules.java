package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Quizzify");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(48,25,52));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 750, 400);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1.  The quiz consists of 10 questions." + "<br><br>" +
                "2.  Each question is worth 2 points, toltal 20 points " + "<br><br>" +
                "3. Participants have 15 seconds to answer each question." + "<br><br>" +
                "4. Participants can use the \"Next\" button to move to the next question.." + "<br><br>" +
                "5. Participants can use the \"Submit\" button to finalize their answers." + "<br><br>" +
                "6. Each question is multiple-choice with four options" + "<br><br>" +
                "7. Participants can use the 50-50 lifeline for each question, which eliminates two incorrect options, leaving two choices" + "<br><br>" +
                "8. Participants are not allowed to switch to other windows or apps during the quiz." + "<br><br>" +
                "9. Any form of malpractice, including looking up answers or using external resources, is strictly prohibited"+"<br><br>"+
               "10. The participant's score will be displayed at the end of the quiz after all questions have been answered.." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(48,25,52));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(48,25,52));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
