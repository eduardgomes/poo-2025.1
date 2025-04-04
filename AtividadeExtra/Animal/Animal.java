package animal;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal() {}

    public Animal(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser menor que 0.");
        }
        this.idade = idade;
    }
    
    public void emitirSom() {
        System.out.println("Som genérico de animal.");
    }
}
