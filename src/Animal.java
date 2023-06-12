/*Classe Animal, atributos: Nome, espécie, patas, som; 
Métodos: getNome, getEspécie, getDescricaoResumida, getDescricaoCompleta, getSom, getPatas.

 */

public class Animal
{
    protected String nome;
    protected String especie;
    protected int patas;
    protected String som;

    public Animal(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }

    public String getEspecie()
    {
        return especie;
    }

    public int getPatas()
    {
        return patas;
    }

    public String getSom()
    {
        return som;
    }

    public String getDescricaoResumida()
    {
        return nome + " é um(a) " + especie;
    }

    public String getDescricaoCompleta()
    {
        return null;
    }

}