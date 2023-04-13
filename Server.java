import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Server extends JFrame implements ActionListener{

    Server(){

        setLayout(null);
        JPanel p1 =new JPanel();
        p1.setBackground(new Color(135, 206, 235));
        p1.setBounds(0,0, 450, 70);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("src/chatting/leftarrow.png"));
        Image i2 = i1.getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(5,15,40,40);
        p1.add(back);

      
        back.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent ae){
                System.exit(0);
                
            }
        });
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("src/chatting/boy.png"));
        Image i5 = i4.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(50,10,50,50);
        p1.add(profile);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("src/chatting/video.png"));
        Image i8 = i7.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel vc = new JLabel(i9);
        vc.setBounds(300,20,30,30);
        p1.add(vc);

        ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("src/chatting/phone.png"));
        Image i11=i10.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        JLabel phone=new JLabel(i12);
        phone.setBounds(350,20,30,30);
        p1.add(phone);

        ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("src/chatting/3icon.png"));
        Image i14=i13.getImage().getScaledInstance(12,30, Image.SCALE_DEFAULT);
        ImageIcon i15=new ImageIcon(i14);
        JLabel dot=new JLabel(i15);
        dot.setBounds(400,20,12,30);
        p1.add(dot);

        JLabel name = new JLabel("BOY");
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,18));
        name.setBounds(110,15,100,18);
        p1.add(name);

        JLabel status = new JLabel("Active Now");
        status.setForeground(Color.white);
        status.setFont(new Font("SAN_SERIF",Font.BOLD,12));
        status.setBounds(110,35,100,18);
        p1.add(status);

        JPanel a1 = new JPanel();
        a1.setBounds(5,75,440,570);
        add(a1);

        JTextField text1 = new JTextField();
        text1.setBounds(5,655,310,40);
        text1.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(text1);

        JButton send =new JButton("Send");
        send.setBounds(320,655,123,40);
        add(send);


        setSize(450,700);
        setLocation(200,15);
        setUndecorated(true);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

    }

    public static void main(String[] args) {
        new Server();
    }
}