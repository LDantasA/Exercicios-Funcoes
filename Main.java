import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1;

        while (true) {
            System.out.println("Digite um número inteiro:");
            num1 = sc.nextInt();
            if (num1 == 0) break;
            if (isPar(num1)) {
                System.out.println("Número par");
            } else {
                System.out.println("Número ímpar");
            }
            System.out.println("Digite 0 para ir para o próximo exercicio");
        }

        System.out.println("Digite um número de 1 a 7:");
        num1 = sc.nextInt();
        System.out.println(exibirDiaDaSemana(num1));

        int[] numeros = new int[5];
        System.out.println("Vamos preencher um vetor com 5 números inteiros.");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número");
            numeros[i] = sc.nextInt();
        };
        System.out.println("O maior valor do vetor é " + encontrarMaxVetor(numeros));
        System.out.println("O menor valor do vetor é " + encontrarMinVetor(numeros));
        System.out.println("A média entre o maior e o menor valor é " + encontrarMediaMaxMinVetor(numeros));
        
        System.out.println("Digite um número inteiro:");
        num1 = sc.nextInt();
        System.out.println("O fatorial desse número é " + calcularFatorial(num1));

        sc.close();
    }

    public static void mensagem() {
        System.out.println("Meu primeiro programa com funções");
    }

    public static void imprimeNovaMensagem(String param) {
        System.out.println("Meu primeiro programa com funções e parâmetro: " + param);
    }

    public static int encontrarMax(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static boolean isPar(int num) {
        return (num % 2 == 0);
    }

    public static String exibirDiaDaSemana(int num) {
        switch (num) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda";
            case 3:
                return "Terça";
            case 4:
                return "Quarta";
            case 5:
                return "Quinta";
            case 6:
                return "Sexta";
            case 7:
                return "Sábado";
            default:
                return "Dia da semana inválido";
        }
    }

    public static int encontrarMaxVetor(int[] numeros) {
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            max = encontrarMax(max, numeros[i]);
        }
        return max;
    }

    public static int encontrarMinVetor(int[] numeros) {
        int min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            min = numeros[i] < min ? numeros[i] : min;
        }
        return min;
    }

    public static int encontrarMediaMaxMinVetor(int[] numeros) {
        int max = encontrarMaxVetor(numeros);
        int min = encontrarMinVetor(numeros);
        return (max + min) / 2;
    }

    public static int calcularFatorial(int num) {
        int fatorial = 1;
        for (int i = num; i > 0; i--) {
            fatorial = i * fatorial;
        }
        return fatorial;
    }
}
