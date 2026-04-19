import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsExercicio10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senhaDigitada = sc.next();

        // ^ começou da string $ final da string
        // contemplam letra maiscula, precisa ter um numero de 0 - 9 , letras minusculas e caracteres especial

        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[#@$%^&]).{8}$");
        Matcher matcher = pattern.matcher(senhaDigitada);

        if(matcher.find()){
            System.out.println("Senha atendeu os requisitos de segurança!");
        } else {
            System.out.println("Senha Não atendeu os requisitos de seguranças!");
        }

    }
}
