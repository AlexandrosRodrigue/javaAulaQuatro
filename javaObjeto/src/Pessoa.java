public class Pessoa {
    private String nome;
    private int idade;


    public Pessoa(String n, int d){
        this.nome= n;
        this.idade= d;

    }

    public void setIdade(int i){
        this.idade = i;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String t){
        this.nome = t;
    }
    public String getNome(){
        return this.nome;
    }
}
