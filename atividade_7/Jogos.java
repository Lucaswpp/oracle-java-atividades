public class Jogos
{
    public int id_jogo;
    public int custo;
    public String nome_jogo;

    public Jogos(int custo)
    {
        this.custo = custo;
        Terminal.jogos_registrados.add(this);
    }
}
