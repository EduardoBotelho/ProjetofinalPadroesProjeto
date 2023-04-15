package dio.MyFirstProjectPatterns.Service.Impl;

import dio.MyFirstProjectPatterns.Service.EmpresaService;
import dio.MyFirstProjectPatterns.model.Empresa;
import dio.MyFirstProjectPatterns.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmpresaImplService implements EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;
    @Override
    public Iterable<Empresa> buscarTodos() {
        return null;
    }

    @Override
    public Empresa buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Empresa empresa) {

    }

    @Override
    public void atualizarEmpresa(Long id, Empresa empresa) {

    }


    @Override
    public void deletar(Long  id) {
        empresaRepository.deleteById(String.valueOf(id));
    }
}
