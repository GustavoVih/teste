import javax.swing.JOptionPane;

public class Main6 {

    public static void main (String [] args){
        float notaA = Float.parseFloat(JOptionPane.showInputDialog("Insira uma nota A: "));
        float notaB = Float.parseFloat(JOptionPane.showInputDialog("Insira uma nota B: "));
        float notaC = Float.parseFloat(JOptionPane.showInputDialog("Agora, uma nota C: "));
        float notaD = Float.parseFloat(JOptionPane.showInputDialog("Para finalizar, a nota C: "));
        float media = (notaA + notaB + notaC + notaD)/4;

        if ((media > -1) && (media < 11)){
                if(media > 6){
                    JOptionPane.showMessageDialog(null, "Aluno aprovado com uma média de: "+media, "Aprovado!", JOptionPane.INFORMATION_MESSAGE);  
                } else{
                     JOptionPane.showMessageDialog(null, "Aluno reprovado com uma média de: "+media, "Reprovado!", JOptionPane.INFORMATION_MESSAGE);
                }
        } else{
            JOptionPane.showMessageDialog(null, "Insira uma nota entre 1 e 10!", "Nota Inválida", JOptionPane.WARNING_MESSAGE);
        }

    }

}
