package dio.MyFirstProjectPatterns.Service;

import dio.MyFirstProjectPatterns.model.Funcionario;

public interface FuncionarioService {
    Iterable<Funcionario> buscarTodos();
     Funcionario buscarPorId(Long id);
     void inserir(Funcionario funcionario);
     void atualizar(Long id, Funcionario funcionario);
     void deletar(Long id);
}
