package dio.MyFirstProjectPatterns.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empresa {

    @Id
    private Long id;
    private String nome;

    public Empresa() {
    }

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
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
                "cnpj='" + id + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
