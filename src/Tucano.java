public class Tucano extends Animal
{
    private int patas;
    private String som;
    private Boolean voaBem;
    private String especie;

    public Tucano(String nome, Boolean voaBem)
    {
        super(nome);
        this.patas = 2;
        this.som="tuc-tuc";
        this.voaBem = voaBem;
        this.especie = "Tucano";
    }

    public int getPatas()
    {
        return this.patas;
    }

    public String getSom()
    {
        return this.som;
    }

    public Boolean voaBem()
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