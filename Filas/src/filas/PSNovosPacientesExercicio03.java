package filas;


import java.util.Random;

public class PSNovosPacientesExercicio03 implements Runnable{

    private FilaComPrioridade<PessoaExercicio03> fila;
    private int contador = 11;
    private Random prioridadeAleatoria = new Random();

    public PSNovosPacientesExercicio03(FilaComPrioridade<PessoaExercicio03> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {

        for(int i = 0; i < 8; i++) {
            try{
                Thread.sleep(8000);
                PessoaExercicio03 p = new PessoaExercicio03("" + contador, prioridadeAleatoria.nextInt(3));
                fila.enfileirarElementos(p);
                contador++;
                System.out.println(p + " aguarda atendimento.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
