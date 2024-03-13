/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encontrandomenorvalorvetor;

import java.util.Random;

/**
 *
 * @author higor
 */
public class EncontrandoMenorValorVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random valoresAleatorios = new Random();
        int[] valores = new int[10];
        int menorValor = 0;
        
        for(int i = 0; i < valores.length; i++) {
            valores[i] = valoresAleatorios.nextInt(1, 50);
        }
        
        
        for(int j = 0; j < valores.length; j++) {
            System.out.print(valores[j] + " ");
            if(j == 1) {
                menorValor = valores[0];
            } else if(valores[j] < menorValor) {
                menorValor = valores[j];
            }
        }
        
        System.out.println("");
        System.out.println("O menor valor do vetor é: " + menorValor);
        
    }
    
}
