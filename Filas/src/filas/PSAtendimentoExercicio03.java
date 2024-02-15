package filas;


public class PSAtendimentoExercicio03 implements Runnable{

    private FilaComPrioridade<PessoaExercicio03> fila;

    public PSAtendimentoExercicio03(FilaComPrioridade<PessoaExercicio03> fila) {
        super();
        this.fila = fila;
    }
    @Override
    public void run() {
        while(!fila.estaVazia()) {
            try{
                System.out.println(fila.desenfileirarElementoFila() + " atendida.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todos os pacientes foram atendidos.");
    }
}
