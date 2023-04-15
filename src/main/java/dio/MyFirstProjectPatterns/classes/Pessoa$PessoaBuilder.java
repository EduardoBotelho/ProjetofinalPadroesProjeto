package dio.MyFirstProjectPatterns.classes;

public class Pessoa$PessoaBuilder {
    private String nome;
    private String ultimoNome;
    private String nomeDoMeio;
    private String apelido;
    private String nomeDoPai;

    public Pessoa$PessoaBuilder(String nome) {
        this.nome = nome;
    }

    public Pessoa$PessoaBuilder(String nome, String ultimoNome, String nomeDoMeio, String apelido, String nomeDoPai) {
    }

    public Pessoa$PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Pessoa$PessoaBuilder ultimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
        return this;
    }

    public Pessoa$PessoaBuilder nomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
        return this;
    }

    public Pessoa$PessoaBuilder apelido(String apelido) {
        this.apelido = apelido;
        return this;
    }

    public Pessoa$PessoaBuilder nomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
        return this;
    }

    public Pessoa$PessoaBuilder build() {
        return new Pessoa$PessoaBuilder(this.nome, this.ultimoNome, this.nomeDoMeio, this.apelido, this.nomeDoPai);
    }
}
