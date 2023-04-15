package dio.MyFirstProjectPatterns.Service;

import dio.MyFirstProjectPatterns.model.Empresa;
import dio.MyFirstProjectPatterns.model.Funcionario;

public interface EmpresaService {
    Iterable<Empresa> buscarTodos();
    Empresa buscarPorId(Long id);
    void inserir(Empresa empresa);
    void atualizarEmpresa(Long id, Empresa empresa);
    void deletar(Long id);
}
