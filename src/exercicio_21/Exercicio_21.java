package exercicio_21;

import javax.swing.JOptionPane;

public class Exercicio_21 {

    public static void main(String[] args) {
        int i;
        for (i = 34; i < 57; i++) {
            if ((i % 2) == 0) {
                JOptionPane.showMessageDialog(null, "Numero par: " + i);
            }
        }
    }
}