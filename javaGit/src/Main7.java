import javax.swing.JOptionPane;

public class Main7 {

    public static void main (String [] args){
        float ladoA = Float.parseFloat(JOptionPane.showInputDialog("Insira um lado A: "));
        float ladoB = Float.parseFloat(JOptionPane.showInputDialog("Insira um lado B: "));
        float ladoC = Float.parseFloat(JOptionPane.showInputDialog("Agora, um lado C: "));

        if ((ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB)){
            JOptionPane.showMessageDialog(null, "Condição de existência satisfeita!", "Temos um triângulo!", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Vamos ver que tipo de triângulo ele é!", "Continuando...", JOptionPane.PLAIN_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Condição de existência não satisfeita!", "Não temos um triângulo", JOptionPane.ERROR_MESSAGE);
        }

    }

}
