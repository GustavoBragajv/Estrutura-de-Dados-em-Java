package filas;


public class PessoaExercicio03 implements Comparable<PessoaExercicio03>{
    private String nome;
    private int prioridade;


    public PessoaExercicio03() {
        super();
    }


    public PessoaExercicio03(String nome, int prioridade) {
        super();
        this.setNome(nome);
        this.setPrioridade(prioridade);
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return this.nome;
    }


    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }


    public int getPrioridade() {
        return this.prioridade;
    }


    public String toString() {
        return "Pessoa [nome=" + nome + ", prioridade=" + prioridade + "]";
    }


    @Override
    public int compareTo(PessoaExercicio03 o) {

        if(prioridade > o.prioridade) {
            return 1;
        } else if(prioridade < o.prioridade) {
            return -1;
        }
        return 0;
    }
}
