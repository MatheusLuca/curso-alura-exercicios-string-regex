import java.util.Scanner;

public class StringExercicio2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o titulo: ");
        String titulo = sc.nextLine();
        System.out.println("Insira descrição: ");
        String descricao = sc.nextLine();

        System.out.println("Titulo em maisculo: ");
        System.out.println(titulo.toUpperCase());
        System.out.println("Descrição em minusculo: ");
        System.out.println(descricao.toLowerCase());
    }
}
