package dio.MyFirstProjectPatterns.Service;

import dio.MyFirstProjectPatterns.model.Empresa;

import java.util.Optional;

public interface EmpresaService {
    Iterable<Empresa> buscarTodos();
    Optional<Empresa> buscarPorId(Long id);
    void inserir(Empresa empresa);
    void atualizarEmpresa(Long id, Empresa empresa);
    void deletar(Long id);
}
