import java.util.Scanner;
import java.util.regex.Pattern;

public class StringExercicio6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor monetário com bastante casas decimais: ");
        String dinheiro = sc.nextLine();
        System.out.println(dinheiro.replaceAll("^(\\d+,\\d{2})\\d+$", "$1"));

    }
}
