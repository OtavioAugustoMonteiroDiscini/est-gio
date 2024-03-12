
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author otavi
 */
public class SequenciaFibonacci2 {
    public static void main(String[] args) {
    
        int num;
       num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para verificar se pertence a sequencia de Fibonacci: "));
    
        
        if (isFibonacci(num)) {
            JOptionPane.showMessageDialog(null, num + " pertence à sequência de Fibonacci.");
        } else {
            JOptionPane.showMessageDialog(null, num + " não pertence à sequência de Fibonacci.");
        }
        
   
    }
    
    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
               
        while (a <= n) {
            if (a == n) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        return false;
    }
}
    

