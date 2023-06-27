import java.util.Scanner;


public class ProcessName {

    static String abbr_nome(String nome)
    {
        String[] nome_partes = nome.split(" ");
        nome_partes[0] = nome_partes[0].substring(0,1);

        return nome_partes[1]+", "+nome_partes[0]+".";
    }
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String nome = console.nextLine();
        
        System.out.println(abbr_nome(nome));
        
    }
}