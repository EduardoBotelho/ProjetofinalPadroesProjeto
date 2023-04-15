package dio.MyFirstProjectPatterns.repository;

import dio.MyFirstProjectPatterns.model.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface EmpresaRepository extends CrudRepository<Empresa, String> {

}
