public class AluraString {
    static void main(java.lang.String[] args) {
        java.lang.String professor = "Jacqueline Oliveira";

        java.lang.String disciplina = "Java e Programação Orientada a Objetos";

        java.lang.String curriculo = """
                Pós Graduada em Engenharia e 
                Arquitetura de Software;
                Desenvolvedora backend Java desde 2010""";

        java.lang.String texto = java.lang.String.format("Disciplina: %s - %s", disciplina.trim(), professor);
        System.out.println(texto);

        System.out.printf("Nome: %s %nDisciplina: %s", professor.replace("Oliveira", "Magalhães"), disciplina.trim());
        System.out.println();
        System.out.printf(curriculo);

        System.out.println(disciplina.trim());
        System.out.println(disciplina.toUpperCase());
        System.out.println(professor.charAt(11));
        // Pega um intervalo de valores de uma  string
        System.out.println(disciplina.substring(0, 15));

    }
}
