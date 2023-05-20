package swingdemo;

import javax.swing.*;

public class Swingdemo {
    public static void main(String[] args) {
        // Crear un JFrame (ventana)
        JFrame frame = new JFrame("Swing Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Crear un JPanel (contenedor)
        JPanel panel = new JPanel();
        
        // Crear y agregar componentes al panel
        JButton button = new JButton("Clickeame!");
        JLabel label = new JLabel("Hola, Swing!");
        JTextField textField = new JTextField(10);
        JPasswordField passwordField = new JPasswordField(10);
        JCheckBox checkBox = new JCheckBox("Márcame!");
        JRadioButton radioButton = new JRadioButton("Opcion 1");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Opcion 1", "Opcion 2", "Opcion 3"});
        JList<String> list = new JList<>(new String[]{"objeto 1", "objeto 2", "objeto 3"});
        
        panel.add(button);
        panel.add(label);
        panel.add(textField);
        panel.add(passwordField);
        panel.add(checkBox);
        panel.add(radioButton);
        panel.add(comboBox);
        panel.add(list);
        
        // Agregar el panel al frame y hacerlo visible
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
