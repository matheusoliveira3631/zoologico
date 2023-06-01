/*
Classe Avestruz, atributos: Nome, Patas, Som, VoaBem; 
Métodos: getNome, getVoaBem, getSom, getDescricaoResumida, getDescricaoCompleta 
 */

public class Avestruz extends Animal
{
    private int patas;
    private String som;
    private boolean voaBem;
    private String especie;

    public Avestruz(String nome, boolean voaBem)
    {
        super(nome);
        this.patas = 2;
        this.som = "gru-gru";
        this.voaBem = voaBem;
        this.especie = "Avestruz";
    }

    public int getPatas()
    {
        return this.patas;
    }

    public String getSom()
    {
        return this.som;
    }

    public boolean voaBem()
    {
        return this.voaBem;
    }

    public String getDescricaoResumida()
    {
        return this.getNome()+ "é um(a) "+this.especie;
    }

    public String getDescricaoCompleta()
    {
        return this.getDescricaoResumida()+", tem "+this.patas+" patas, faz "+this.som+" e "+(this.voaBem ? "voa bem" : "não voa bem");
    }
}