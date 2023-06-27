public class Equipe
{
    String nome_equipe;
    int numero_vitorias;
    int numero_derrotas;
    int saldo_equipe;
    int numero_empates;

    public Equipe(String nome_equipe)
    {
        this.nome_equipe = nome_equipe;
        saldo_equipe = numero_vitorias - numero_derrotas;
    }


    public String get_nome_equipe()
    {
        return nome_equipe;
    }
    
}
