package filas;

public class DocumentoExercicio01 {
    private String nome;
    private int numFolhas;


    public DocumentoExercicio01() {
        super();
    }


    public DocumentoExercicio01(String nome, int numFolhas){
        super();
        this.setNome(nome);
        this.setNumFolhas(numFolhas);
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return this.nome;
    }


    public void setNumFolhas(int numFolhas) {
        this.numFolhas = numFolhas;
    }


    public int getNumFolhas() {
        return this.numFolhas;
    }

}
