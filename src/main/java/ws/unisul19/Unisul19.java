
package ws.unisul19;
import javax.swing.JOptionPane;
public class Unisul19 {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Escreva uma frase: ");
        int vezes = Integer.parseInt(JOptionPane.showInputDialog("Qual o número de vezes ela deve aparecer?"));
        
        for (int i = 1; i <= vezes; i++ ) {
            JOptionPane.showMessageDialog(null, frase);
        }
    }
}
