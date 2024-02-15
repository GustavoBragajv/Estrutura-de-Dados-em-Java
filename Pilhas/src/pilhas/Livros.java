public class Livros {
    private String isbn;
    private String autor;
    private String nome;
    private int anoLancamento;


    public Livros() {
        super();
    }


    public Livros(String isbn, String autor, String nome, int anoLancamento) {
        super();
        this.setIsbn(isbn);
        this.setAutor(autor);
        this.setNome(nome);
        this.setAnoLancamento(anoLancamento);
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getAnoLancamento() {
        return anoLancamento;
    }


    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }


    @Override
    public String toString() {
        return "Livros{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}
