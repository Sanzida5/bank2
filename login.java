



package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {
    JLabel lebel1,lebel2,lebel3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;
    login()
    {
        super("bank management system");
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance( 100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);
        ImageIcon ii1= new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2= ii1.getImage().getScaledInstance( 100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage=new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);


        lebel1 =new JLabel("welcome to ATM");
        lebel1.setForeground(Color.white);
        lebel1.setFont(new Font("AvantGrade",Font.BOLD,38));
        lebel1.setBounds(230,125,450,40);
        add(lebel1);
        lebel2 =new JLabel("Card no:");
        lebel2.setForeground(Color.white);
        lebel2.setFont(new Font("Ralway",Font.BOLD,38));
        lebel2.setBounds(150,190,375,30);
        add(lebel2);

        textField2= new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        lebel3 =new JLabel("PIN:");
        lebel3.setForeground(Color.white);
        lebel3.setFont(new Font("AvantGrade",Font.BOLD,38));
        lebel3.setBounds(150,250,375,40);
        add(lebel3);

        passwordField3= new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);






        ImageIcon iii1= new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2= iii1.getImage().getScaledInstance( 850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage=new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);


        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        try{
            if(e.getSource()==button1)
            {

            }else if(e.getSource()==button2)
            {
                textField2.setText("");
                passwordField3.setText("");
            }else if(e.getSource()==button3)
            {
              new signup();
              setVisible(false);
            }
        }
        catch(Exception E)
        {
            E.printStackTrace();
        }

    }
    public static void main(String[] args)
    {
        new login();
    }
}

