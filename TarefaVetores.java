
import java.util.Scanner;
public class TarefaVetores {
    
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        // Para a declaraçao do vetor
        int[] vetor = new int[5];
        
        // Para a declaracao de variavel
        int num;
        
        // Para a entrada de dados -> vetor
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor para a posição " + i);
            vetor[i] = in.nextInt();
        }
        
        // Para a entrada de dados -> variável
        System.out.println("Digite um valor para procurar no vetor");
        num = in.nextInt();
        
        // Para a leitura do vetor
        for(int i = 0; i < vetor.length; i++){
            
            // Caso existir no vetor o número digitado
            if(vetor[i] == num){
                System.out.println("O índice do número digitado é " + i);
            // se não existir
            } else if(i == vetor.length-1){
                System.out.println("Número não foi encontrado no vetor");
            }
        }
    }
}

