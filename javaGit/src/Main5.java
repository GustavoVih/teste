import javax.swing.JOptionPane;
/* JOptionPane considera qualquer variável que entra como String, dessa forma temos que converter para número! */

public class Main5 {

    public static void main (String [] args){
        /* Aqui estamos convertendo a variável que está entrando (valorA e valorB) para float! */
        /* "Float.parseFloat" que está convertendo essas variáveis para float */
        float valorA = Float.parseFloat(JOptionPane.showInputDialog("Valor a: "));
        float valorB = Float.parseFloat(JOptionPane.showInputDialog("Valor b: "));
        float resultado = valorA + valorB;
        JOptionPane.showMessageDialog(null, "Resultado final: "+resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }

}