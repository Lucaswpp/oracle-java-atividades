import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args)
    {
         String nome = JOptionPane.showInputDialog(null,"Digite seu nome: ");

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade: "));

        String sexo = JOptionPane.showInputDialog(null, "Digite seu sexo: ");

        String msg = "Seu nome é "+nome+",você tem "+idade+"anos e do sexo "+sexo;

        JOptionPane.showMessageDialog(null, msg);
    }   
}