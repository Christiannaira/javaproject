import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {

        this.setVisible(true); // make this visible
        this.setSize(500, 500); // sets the x-dimension and y-dimension of this
        this.setTitle("My First JAVA GUI Program"); // sets title of this
        this.setResizable(false); // make this visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application

        ImageIcon image = new ImageIcon("src\\dailydev.png"); // creates an ImageIcon
        this.setIconImage(image.getImage()); // change the icon of this

        this.getContentPane().setBackground(Color.green);
        this.getContentPane().setBackground(new Color(0,0,0)); // change color of background
        this.getContentPane().setBackground(new Color(0x123456)); // change color of background

    }



}
