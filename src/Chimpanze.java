public class Chimpanze extends Animal
{
    private int patas;
    private String som;
    private String pelo;
    private String especie;

    public Chimpanze(String nome, String pelo)
    {
        super(nome);
        this.patas = 2;
        this.som = "uh-uh ahh-ahh";
        this.pelo = pelo;
        this.especie = "Chimpanze";
    }

    public int getPatas()
    {
        return this.patas;
    }

    public String getSom()
    {
        return this.som;
    }

    public String getCorDoPelo()
    {
        return this.pelo;
    }

    public String getDescricaoResumida()
    {
        return this.getNome()+ "é um(a) "+this.especie;
    }

    public String getDescricaoCompleta()
    {
        return this.getDescricaoResumida()+", tem "+this.patas+" patas, faz "+this.som+" e tem pelo "+this.getCorDoPelo();
    }
}