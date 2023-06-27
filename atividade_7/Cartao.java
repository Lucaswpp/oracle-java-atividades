public class Cartao
{
    public static int cont_cartao;
    public int id;
    public int ticktes;
    public int credito;
    public String nome;

    public Cartao(String nome)
    {
        this.nome = nome;
        this.id = Cartao.cont_cartao;
        this.credito += 300;
        Cartao.cont_cartao += 1;
        Terminal.cartoes_registrados.add(this);
    }
}