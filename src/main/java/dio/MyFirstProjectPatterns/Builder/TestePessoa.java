package dio.MyFirstProjectPatterns.Builder;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa$PessoaBuilder p = new Pessoa$PessoaBuilder("Eduardo")
                .ultimoNome("Botelho")
                .nomeDoMeio("Miguel")
                .apelido("dininho").nomeDoPai("Dibao")
                .build();
        System.out.println(p.toString());


        Pessoa$PessoaBuilder p2 = new Pessoa$PessoaBuilder("Teste")
                .ultimoNome("Teste2")
                .nomeDoMeio("Teste 3")
                .apelido("TEste 4")
                .nomeDoPai("Teste 5");

        System.out.println(p2.toString());


    }
}
