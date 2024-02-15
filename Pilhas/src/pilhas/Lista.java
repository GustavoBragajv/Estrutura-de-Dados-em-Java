package pilhas;

public class Lista<T> extends EstruturaEstatica<T>{


    public Lista() {
        super();
    }
    public Lista(int capacidade) {
        super(capacidade);
    }


    public boolean adicionaElemento(T elemento) {
        return super.adicionarElementos(elemento);
    }


    public boolean adicionaElementoPosicao(int posicao, T elemento) {
        return super.adicionarElementosPosicao(posicao, elemento);
    }

}
