package filas;

public class Exercicio01 {
    public static void main(String[] args) {
        Filas<DocumentoExercicio01> filaDocumentos = new Filas<DocumentoExercicio01>();
        filaDocumentos.enfileirarElementos(new DocumentoExercicio01("A", 1));
        filaDocumentos.enfileirarElementos(new DocumentoExercicio01("B", 3));
        filaDocumentos.enfileirarElementos(new DocumentoExercicio01("C", 15));
        filaDocumentos.enfileirarElementos(new DocumentoExercicio01("D", 7));
        filaDocumentos.enfileirarElementos(new DocumentoExercicio01("E", 9));

        while(!filaDocumentos.estaVazia()) {
            DocumentoExercicio01 doc = filaDocumentos.desenfileirarElementoFila();
            System.out.println("Imprimindo o documento: " + doc.getNome());

            try{
                Thread.sleep(200 * doc.getNumFolhas());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todos os documentos foram impressos.");
    }
}
