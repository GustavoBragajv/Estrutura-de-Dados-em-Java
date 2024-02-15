package pilhas;

import java.lang.reflect.Array;

public class EstruturaEstatica<T> {
    protected T[] elementos;
    protected int tamanho;


    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // solução dada pelo livro efetivo java
        this.tamanho = 0;
    }


    public EstruturaEstatica() {
        this(10);
    }


    protected boolean adicionarElementos(T elemento) {
        aumentarCapacidade();
        if (this.getTamanho() < this.elementos.length) {
            this.elementos[this.getTamanho()] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected boolean adicionarElementosPosicao(int posicao, T elemento) {
        aumentarCapacidade();
        if (!(posicao >= 0 && posicao < getTamanho())) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = getTamanho() - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }


    protected void removerElementos(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = elementos[i + 1];
        }

        this.tamanho--;
    }


    private void aumentarCapacidade() {
        if (this.getTamanho() == this.elementos.length) {
            T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
            System.arraycopy(this.elementos, 0, novosElementos, 0, this.elementos.length);
            this.elementos = novosElementos;
        }
    }


    public int getTamanho() {
        return this.tamanho;
    }


    public boolean estaVazia() {
        return this.getTamanho() == 0;
    }


    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.getTamanho() - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.getTamanho() > 0) {
            s.append(this.elementos[this.getTamanho() - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
