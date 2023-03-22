import javax.swing.*;
import java.awt.*;

public class Main {
    public Main(){
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setBackground(Color.gray);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Converter");
        frame.add(PanelAdder());
        frame.setVisible(true);
    }
    public static JPanel PanelAdder(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
//        panel.setBackground(Color.DARK_GRAY);

        Font f=new Font("Arial",Font.BOLD,14);
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        Cursor textcursor = new Cursor(Cursor.MOVE_CURSOR);
        JLabel label = new JLabel("Temperature Convertor");
        label.setBounds(50, 40, 800, 20);
        label.setFont(f);
        String s[] = {"Celsius", "Fahrenheit", "Kelvin"};
        JComboBox jComboBox1 = new JComboBox(s);
        jComboBox1.setBounds(50, 70, 100, 20);
        JTextField textField1 = new JTextField(100);
        textField1.setBounds(160, 70, 100, 20);
        textField1.setCursor(textcursor);
        JLabel label1 = new JLabel("=");
        label1.setBounds(265, 70, 100, 20);
        panel.add(label);
        panel.add(jComboBox1);
        panel.add(textField1);
        panel.add(label1);


        return panel;
    }
    public static void main(String[] args) {
        new Main();
    }
}