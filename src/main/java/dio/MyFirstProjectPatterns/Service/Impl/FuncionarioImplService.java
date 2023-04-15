package dio.MyFirstProjectPatterns.Service.Impl;

import dio.MyFirstProjectPatterns.Service.FuncionarioService;
import dio.MyFirstProjectPatterns.model.Funcionario;
import dio.MyFirstProjectPatterns.repository.EmpresaRepository;
import dio.MyFirstProjectPatterns.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuncionarioImplService implements FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public Iterable<Funcionario> buscarTodos(){
      return funcionarioRepository.findAll();
    }
    @Override
    public Funcionario buscarPorId(Long id){
        Optional<Funcionario> funcionario = funcionarioRepository.findById(id);
        return funcionario.get();
    }
    @Override
    public void inserir(Funcionario funcionario){
        funcionarioRepository.save(funcionario);
    }

    @Override
    public void atualizar(Long id, Funcionario funcionario){
            Optional<Funcionario> funcionariobd = funcionarioRepository.findById(id);
            if(funcionariobd.isPresent()){
                funcionarioRepository.save(funcionario);
            }
    }
    public void deletar(Long id){
        funcionarioRepository.deleteById(id);
    }
}
