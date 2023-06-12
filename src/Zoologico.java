import java.util.HashMap;


public class Zoologico
{
    private HashMap<String, Tucano> tucanos;
    private HashMap<String, Tigre> tigres;
    private HashMap<String, Chimpanze> chimpanzes;
    private HashMap<String, Avestruz> avestruses;

    public Zoologico()
    {
        this.tucanos = new HashMap<String, Tucano>();
        this.tigres = new HashMap<String, Tigre>();
        this.chimpanzes = new HashMap<String, Chimpanze>();
        this.avestruses = new HashMap<String, Avestruz>();
    }


    public void addTucano(String nome, boolean voaBem)
    {
        Tucano tucano = new Tucano(nome, voaBem);
        this.tucanos.put(nome, tucano);
    }

    public void addTigre(String nome, String pelo)
    {
        Tigre tigre = new Tigre(nome, pelo);
        this.tigres.put(nome, tigre);
    }

    public void addChimpanze(String nome, String pelo)
    {
        Chimpanze chimpanze = new Chimpanze(nome, pelo);
        this.chimpanzes.put(nome, chimpanze);
    }

    public void addAvestruz(String nome, boolean voaBem)
    {
        Avestruz avestruz = new Avestruz(nome, voaBem);
        this.avestruses.put(nome, avestruz);
    }

    public Animal buscaAnimal(String nome) {
        Animal animal = tucanos.get(nome);
        if (animal != null) {
            return animal;
        }

        animal = tigres.get(nome);
        if (animal != null) {
            return animal;
        }

        animal = chimpanzes.get(nome);
        if (animal != null) {
            return animal;
        }

        animal = avestruses.get(nome);
        if (animal != null) {
            return animal;
        }

        return null; // Retorna null se o nome não corresponder a nenhum animal
    }

    private String iteraDescricoes(HashMap<String, ? extends Animal> animais, boolean completa) {
        String descricoes = "";
        for (Animal animal : animais.values()) {
            if(completa)
            {
                descricoes += animal.getDescricaoCompleta() + "\n";
            }else
            {
                descricoes += animal.getDescricaoResumida() + "\n";
            }
        }
        return descricoes;
    }

    public String getDescricoesResumidas()
    {
        String descricoes = "";
        descricoes += iteraDescricoes(tucanos, false);
        descricoes += iteraDescricoes(tigres, false);
        descricoes += iteraDescricoes(chimpanzes, false);
        descricoes += iteraDescricoes(avestruses, false);
        return descricoes;
    }

    public String getDescricoesCompletas()
    {
        String descricoes = "";
        descricoes += iteraDescricoes(tucanos, true);
        descricoes += iteraDescricoes(tigres, true);
        descricoes += iteraDescricoes(chimpanzes, true);
        descricoes += iteraDescricoes(avestruses, true);
        return descricoes;
    }

}