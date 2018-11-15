import javax.swing.*;

public class Ex4b {
    public static void main(String[] args) {
        String s, v;
        int i;
        v = JOptionPane.showInputDialog(null, "Introduza o seu nome: ");
        s = JOptionPane.showInputDialog(null, "Introduza um número: ");
        // o valor é lido como uma String
        i = Integer.parseInt(s);
        // a String é convertida para o tipo int
        JOptionPane.showMessageDialog(null, "Nome:" + v + " Número" + i);
    }
}