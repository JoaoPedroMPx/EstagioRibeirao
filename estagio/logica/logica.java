import java.util.Scanner;

//questão 1
public class logica {
    public static void main(String[] args) {

        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor da variável SOMA é: " + SOMA);


//questão 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        if (Fibonacci.isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();

        //questão 5
        String original = "Hello, world!";


        String invertida = inverterString(original);


        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    // Função para inverter a string
    public static String inverterString(String str) {

        char[] caracteres = str.toCharArray();


        String invertida = "";


        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }

        return invertida;




    }

    }



