import java.util.Scanner;

public class StringExercicio3 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();
        System.out.println("Digite a palavra a ser substituída: ");
        String palavraSubstituida = sc.nextLine();
        System.out.println("Digite a nova palavra:");
        String novaPalavra = sc.nextLine();

        if (texto.contains(palavraSubstituida)){
            String novoTexto = texto.replace(palavraSubstituida, novaPalavra);
            System.out.println(novoTexto);
        }

    }
}
