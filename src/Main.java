import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public Main(){
        JFrame frame = new JFrame();
        JTabbedPane tab = new JTabbedPane();
        frame.setSize(600, 200);
        frame.setBackground(Color.gray);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Converter");
        tab.addTab("Temperature", TemperaturePanelAdder());
        tab.addTab("Currency", CurrencyPanelAdder());
        frame.add(tab);
//        frame.add(TemperaturePanelAdder());
        frame.setVisible(true);
    }
    public static JPanel TemperaturePanelAdder(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
//        panel.setBackground(Color.DARK_GRAY);

        Font f=new Font("Arial",Font.BOLD,14);
        Font f2 = new Font("Arial",Font.BOLD,30);
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        Cursor textcursor = new Cursor(Cursor.MOVE_CURSOR);
        JLabel label = new JLabel("Temperature Convertor");
        label.setBounds(50, 40, 800, 50);
        label.setFont(f2);
        String s[] = {"Celsius", "Fahrenheit", "Kelvin"};
        JComboBox jComboBox1 = new JComboBox(s);
        jComboBox1.setBounds(50, 100, 100, 20);
        JTextField textField1 = new JTextField(100);
        textField1.setBounds(160, 100, 100, 20);
        textField1.setCursor(textcursor);
        JLabel label1 = new JLabel("=");
        label1.setBounds(265, 100, 20, 20);
        String type = (String) jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        JComboBox jComboBox2 = new JComboBox(s);
        jComboBox2.setBounds(290, 100, 100, 20);
        JTextField textField2 = new JTextField(200);
        textField2.setBounds(395, 100, 300, 20);
        panel.add(label);
        panel.add(jComboBox1);
        panel.add(textField1);
        panel.add(label1);
        panel.add(jComboBox2);
        panel.add(textField2);
        textField1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type1 = (String) jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
                String type2 = (String) jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
                if(!type1.equals(type2)){
                    if(type1.equals("Celsius")){
                        if(type2.equals("Fahrenheit")){
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.CelToFar()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.CelToKel()));
                            }
                        }
                    }
                    else if (type1.equals("Fahrenheit")){
                        if(type2.equals("Celsius")){
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.FarToCel()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.FarToKel()));
                            }
                        }
                    }
                    else{
                        if(type2.equals("Celsius")){
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.KelToCel()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.KelToFar()));
                            }
                        }
                    }
                }
                else{
                    textField2.setText(String.valueOf(textField1.getText()));
                }
            }
        });
        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type1 = (String) jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
                String type2 = (String) jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
                if(!type1.equals(type2)){
                    if(type1.equals("Celsius")){
                        if(type2.equals("Fahrenheit")){
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.CelToFar()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.CelToKel()));
                            }
                        }
                    }
                    else if (type1.equals("Fahrenheit")){
                        if(type2.equals("Celsius")){
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.FarToCel()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.FarToKel()));
                            }
                        }
                    }
                    else{
                        if(type2.equals("Celsius")){
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.KelToCel()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.KelToFar()));
                            }
                        }
                    }
                }
                else{
                    textField2.setText(String.valueOf(textField1.getText()));
                }
            }
        });

        jComboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type1 = (String) jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
                String type2 = (String) jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
                if(!type1.equals(type2)){
                    if(type1.equals("Celsius")){
                        if(type2.equals("Fahrenheit")){
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.CelToFar()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.CelToKel()));
                            }
                        }
                    }
                    else if (type1.equals("Fahrenheit")){
                        if(type2.equals("Celsius")){
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.FarToCel()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.FarToKel()));
                            }
                        }
                    }
                    else{
                        if(type2.equals("Celsius")){
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.KelToCel()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.KelToFar()));
                            }
                        }
                    }
                }
                else{
                    textField2.setText(String.valueOf(textField1.getText()));
                }
            }
        });

        textField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ActionHandler();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ActionHandler();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                ActionHandler();
            }

            public void ActionHandler(){
                String type1 = (String) jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
                String type2 = (String) jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
                if(!type1.equals(type2)){
                    if(type1.equals("Celsius")){
                        if(type2.equals("Fahrenheit")){
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.CelToFar()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.CelToKel()));
                            }
                        }
                    }
                    else if (type1.equals("Fahrenheit")){
                        if(type2.equals("Celsius")){
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.FarToCel()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.FarToKel()));
                            }
                        }
                    }
                    else{
                        if(type2.equals("Celsius")){
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.KelToCel()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                TemperatureConvertor t = new TemperatureConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.KelToFar()));
                            }
                        }
                    }
                }
                else{
                    textField2.setText(String.valueOf(textField1.getText()));
                }
            }
        });
        return panel;
    }

    public JPanel CurrencyPanelAdder(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
//        panel.setBackground(Color.DARK_GRAY);

        Font f=new Font("Arial",Font.BOLD,14);
        Font f2 = new Font("Arial",Font.BOLD,30);
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        Cursor textcursor = new Cursor(Cursor.MOVE_CURSOR);
        JLabel label = new JLabel("Currency Convertor");
        label.setBounds(50, 40, 800, 50);
        label.setFont(f2);
        String s[] = {"BDT", "Dollar", "Euro"};
        JComboBox jComboBox1 = new JComboBox(s);
        jComboBox1.setBounds(50, 100, 100, 20);
        JTextField textField1 = new JTextField(100);
        textField1.setBounds(160, 100, 100, 20);
        textField1.setCursor(textcursor);
        JLabel label1 = new JLabel("=");
        label1.setBounds(265, 100, 20, 20);
        String type = (String) jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        JComboBox jComboBox2 = new JComboBox(s);
        jComboBox2.setBounds(290, 100, 100, 20);
        JTextField textField2 = new JTextField(200);
        textField2.setBounds(395, 100, 300, 20);
        panel.add(label);
        panel.add(jComboBox1);
        panel.add(textField1);
        panel.add(label1);
        panel.add(jComboBox2);
        panel.add(textField2);
        textField1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type1 = (String) jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
                String type2 = (String) jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
                if(!type1.equals(type2)){
                    if(type1.equals("BDT")){
                        if(type2.equals("Dollar")){
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.BDTToDoll()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.BDTToEuro()));
                            }
                        }
                    }
                    else if (type1.equals("Dollar")){
                        if(type2.equals("BDT")){
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.DollToBDT()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.DollToEuro()));
                            }
                        }
                    }
                    else{
                        if(type2.equals("BDT")){
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.EuroToBDT()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.EuroToDoll()));
                            }
                        }
                    }
                }
                else{
                    textField2.setText(String.valueOf(textField1.getText()));
                }
            }
        });
        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type1 = (String) jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
                String type2 = (String) jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
                if(!type1.equals(type2)){
                    if(type1.equals("BDT")){
                        if(type2.equals("Dollar")){
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.BDTToDoll()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.BDTToEuro()));
                            }
                        }
                    }
                    else if (type1.equals("Dollar")){
                        if(type2.equals("BDT")){
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.DollToBDT()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.DollToEuro()));
                            }
                        }
                    }
                    else{
                        if(type2.equals("BDT")){
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.EuroToBDT()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.EuroToDoll()));
                            }
                        }
                    }
                }
                else{
                    textField2.setText(String.valueOf(textField1.getText()));
                }
            }
        });

        jComboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type1 = (String) jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
                String type2 = (String) jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
                if(!type1.equals(type2)){
                    if(type1.equals("BDT")){
                        if(type2.equals("Dollar")){
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.BDTToDoll()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.BDTToEuro()));
                            }
                        }
                    }
                    else if (type1.equals("Dollar")){
                        if(type2.equals("BDT")){
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.DollToBDT()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.DollToEuro()));
                            }
                        }
                    }
                    else{
                        if(type2.equals("BDT")){
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.EuroToBDT()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.EuroToDoll()));
                            }
                        }
                    }
                }
                else{
                    textField2.setText(String.valueOf(textField1.getText()));
                }
            }
        });

        textField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ActionHandler();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ActionHandler();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                ActionHandler();
            }

            public void ActionHandler(){
                String type1 = (String) jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
                String type2 = (String) jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
                if(!type1.equals(type2)){
                    if(type1.equals("BDT")){
                        if(type2.equals("Dollar")){
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.BDTToDoll()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.BDTToEuro()));
                            }
                        }
                    }
                    else if (type1.equals("Dollar")){
                        if(type2.equals("BDT")){
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.DollToBDT()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.DollToEuro()));
                            }
                        }
                    }
                    else{
                        if(type2.equals("BDT")){
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.EuroToBDT()));
                            }

                        }
                        else{
                            if(!textField1.getText().equals("")){
                                CurrencyConvertor t = new CurrencyConvertor(Double.parseDouble(textField1.getText()), type1);
                                textField2.setText(String.valueOf(t.EuroToDoll()));
                            }
                        }
                    }
                }
                else{
                    textField2.setText(String.valueOf(textField1.getText()));
                }
            }
        });
        return panel;
    }

    public static void main(String[] args) {
        new Main();
    }
}