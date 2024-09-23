import java.util.Scanner;
public class testFibonacci {
    public static void main(String[] args) {
        // título do programa
        System.out.println("Sequência de Fibonacci");

        // definição de variáveis para repetição do programa
        char escolha = 's';
        Scanner scanner = new Scanner(System.in);

        while (escolha == 's') {
            // entrada de números pelo usuário
            System.out.print("\nDigite um número: ");
            int numero = scanner.nextInt();
            int a = 0;
            int b = 1;
            
            boolean loopEnquanto = false;

            while (b <= numero) {
                if (b == numero) {
                    loopEnquanto = true;
                break;}
        
                else {
                    loopEnquanto = false;
                }
        
                int soma = a + b; // incrementação para verificação de Fibonacci
                a = b;
                b = soma;
            }
                
            if (loopEnquanto == true) {
                System.out.println(numero + " pertence à sequência de Fibonacci");
            }
        
            else {
                System.out.println(numero + " este número não pertence à sequência de Fibonacci\n");
            }
        
            System.out.println("Gostaria de tentar novamente? Digite 's' para SIM ou qualquer outra tecla para Encerrar");
            // definição de Scanner para repetição do programa
            scanner.nextLine();

            escolha = scanner.next().charAt(0); 
            // verificação de condição para repetição do programa
            if(escolha != 's') {
                System.out.println("Até a próxima!");
            }
        }   
        scanner.close();
    }               
}
