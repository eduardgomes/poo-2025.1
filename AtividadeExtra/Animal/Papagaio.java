package animal;

public class Papagaio extends Animal {
    private String corPenas;
    private boolean podeFalar;
    private String origem;
    private double alturaVooMaximo;

    public Papagaio(String nome, int idade, String corPenas, boolean podeFalar, String origem, double alturaVooMaximo) {
        super(nome, idade);
        this.corPenas = corPenas;
        this.podeFalar = podeFalar;
        this.origem = origem;
        this.alturaVooMaximo = alturaVooMaximo;
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    public boolean isPodeFalar() {
        return podeFalar;
    }

    public void setPodeFalar(boolean podeFalar) {
        this.podeFalar = podeFalar;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public double getAlturaVooMaximo() {
        return alturaVooMaximo;
    }

    public void setAlturaVooMaximo(double alturaVooMaximo) {
        this.alturaVooMaximo = alturaVooMaximo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Pru pru!");
    }
}
