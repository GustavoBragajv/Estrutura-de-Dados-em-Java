package filas;


public class Filas<T> extends EstruturaEstatica<T>{

    public Filas() {
        super();
    }


    public Filas(int capacidade) {
        super(capacidade);
    }


    public void enfileirarElementos(T elemento){
        //this.elementos[this.tamanhoFila] = elemento;
        //this.tamanhoFila++;

        //this.elementos[this.tamanhoFila++] = elemento;

        this.adicionarElementos(elemento);
    }


    public T espiarElementoFila() {
        if(this.estaVazia()) {
            return null;
        }

        return this.elementos[0];
    }


    public T desenfileirarElementoFila() {
        final int POS = 0;
        if(this.estaVazia()) {
            return null;
        }

        T elementoASerRemovido = this.elementos[POS];
        this.removerElementos(POS);

        return elementoASerRemovido;
    }


}