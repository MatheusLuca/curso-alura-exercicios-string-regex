import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AluraRegex {
    static void main(String[] args) {

        String texto = "Meu email é jacqueline@alura.com.br";

        // Pattern -> define o "molde" (regex), ou seja, a regra do que você quer encontrar
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+.\\w+");

        /*
            compile() -> transforma a regex (String) em um objeto Pattern

            Isso é feito para performance:
            o Java compila a regex uma vez e reutiliza depois,
            em vez de interpretar toda vez que for usar.
        */

        // Matcher -> objeto que vai aplicar a regex no texto e fazer a busca
        Matcher x = pattern.matcher(texto);

        if( x.find()){
            System.out.println(x.group());
        }else{
            System.out.println("Padrao não encontrado!");
        }

        System.out.println(formatarTelefone("11993535211"));

    }

    public static String formatarTelefone(String telefone){
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})"; // EXPRESSAO REGEX
        Pattern pattern = Pattern.compile(regex); // TRANSFORME EXPRESSAO STRING EM OBJETO PATTERN PADRAO
        Matcher matcher = pattern.matcher(telefone); // APLICA O OBJ REGEX NO TEXTO E FAÇA A BUSCA

        if(matcher.find()){
           return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        } else{
            return "Numero de telefone inválido!";
        }

    }
}
