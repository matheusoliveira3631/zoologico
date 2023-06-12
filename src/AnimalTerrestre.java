/*Classe AnimalTerrestre(herda animal); Atributos: pelo; Métodos: getPelo, getDescricaoCompleta.

 */

public class AnimalTerrestre extends Animal
{
    private String pelo;

    public AnimalTerrestre(String nome, String pelo)
    {
        super(nome);
        this.pelo = pelo;
    }

    public String getPelo()
    {
        return pelo;
    }

    public String getDescricaoCompleta()
    {
        return super.getDescricaoResumida() + " que faz" + som + " e tem pelo " + pelo;
    }
}