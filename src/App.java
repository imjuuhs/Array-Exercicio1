import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        System.out.println("Declarando Array \n");

        int[] vetor = new int[10];
        int somavetores = 0;

        for(int i = 0; i < vetor.length; i++) { 

            System.out.println("Digite o valor para a posição " + i + ":");
            vetor[i] = read.nextInt();
        }
        read.close();

        for(int i = 0; i < vetor.length; i++) {
            somavetores = somavetores + vetor[i];

        }
        System.out.println("A soma dos valores é: " + somavetores);




    }
}
