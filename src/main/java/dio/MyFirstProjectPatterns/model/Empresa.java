package dio.MyFirstProjectPatterns.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empresa {

    @Id
    private String cnpj;
    private String nome;

    public Empresa() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
