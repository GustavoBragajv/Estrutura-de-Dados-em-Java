package pilhas;

public class Pilhas<T> extends EstruturaEstatica<T>{


    public Pilhas() {
        super();
    }


    public Pilhas(int capacidade) {
        super(capacidade);
    }


    public void empilharElemento(T elemento) {
        super.adicionarElementos(elemento);
        //this.aumentarCapacidade();
        //this.elementos[tamanho++] = elemento;
    }


    public T desmpilharElemento() {

        if(this.estaVazia()) {
            return null;
        }
        /*T elemento = this.elementos[tamanho - 1];
        tamanho--;

        return elemento;

         */

        return this.elementos[--tamanho];
    }


    public T topoPilha() {
        if(this.estaVazia()) {
            return null;
        } else {
            return this.elementos[getTamanho() - 1];
        }
    }



    //public String toString() {}
}
