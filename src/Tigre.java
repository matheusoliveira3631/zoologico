public class Tigre extends Animal
{
    private int patas;
    private String som;
    private String pelo;
    private String especie;

    public Tigre(String nome, String pelo)
    {
        super(nome);
        this.patas = 4;
        this.som="grrrr";
        this.pelo = pelo;
        this.especie = "Tigre";
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