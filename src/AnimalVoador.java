/*Classe AnimalVoador (herda animal): Atributos: voaBem; Métodos: voaBem, getDescricaoCompleta. */

public class AnimalVoador extends Animal
{
    private boolean voaBem;

    public AnimalVoador(String nome, boolean voaBem)
    {
        super(nome);
        this.voaBem = voaBem;
    }

    public boolean voaBem()
    {
        return voaBem;
    }

    public String getDescricaoCompleta()
    {
        return super.getDescricaoResumida() +" que faz " + som + " e voa " + (voaBem ? "bem" : "mal");
    }
}