package filas;


public class FilaComPrioridade<T> extends Filas<T>{
    public void enfileirarElementos(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i;
        for(i = 0; i < this.tamanho; i++) {
            if(chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        this.adicionarElementosPosicao(i, elemento);
    }
}
