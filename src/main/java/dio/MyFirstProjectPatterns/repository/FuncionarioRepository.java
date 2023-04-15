package dio.MyFirstProjectPatterns.repository;

import dio.MyFirstProjectPatterns.model.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {

    void update(Funcionario funcionario);
}

