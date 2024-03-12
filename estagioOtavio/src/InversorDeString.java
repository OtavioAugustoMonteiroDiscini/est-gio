
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author otavi
 */
public class InversorDeString {
    public static void main(String[] args) {
        String normal;
        
        normal = JOptionPane.showInputDialog("Digite uma frase");
        
        String invertida = new StringBuilder(normal).reverse().toString();
        JOptionPane.showMessageDialog(null, "Aqui está sua String invertida: " + invertida);
        
    }
}
