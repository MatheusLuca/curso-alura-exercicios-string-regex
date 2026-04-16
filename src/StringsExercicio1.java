import java.util.Scanner;

public class StringsExercicio1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um nome com espaçoes em branco no começo e fim!");
        String nome = sc.nextLine();
        System.out.printf("Nome sem espaço: %s", nome.trim());
    }
}
