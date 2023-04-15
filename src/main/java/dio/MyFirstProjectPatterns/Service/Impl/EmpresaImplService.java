package dio.MyFirstProjectPatterns.Service.Impl;

import dio.MyFirstProjectPatterns.Service.EmpresaService;
import dio.MyFirstProjectPatterns.model.Empresa;
import dio.MyFirstProjectPatterns.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class EmpresaImplService implements EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public Iterable<Empresa> buscarTodos() {
        return empresaRepository.findAll();
    }

    @Override
    public Optional<Empresa> buscarPorId(Long id) {
        Optional<Empresa> empresa = empresaRepository.findById(String.valueOf(id));
        return Optional.of(empresa.get());
    }

    @Override
    public void inserir(Empresa empresa) {
        empresaRepository.save(empresa);
    }

    @Override
    public void atualizarEmpresa(Long id, Empresa empresa) {
        Optional<Empresa> empresabd = empresaRepository.findById(String.valueOf(id));
        if(empresabd.isPresent()){
            empresaRepository.save(empresa);
        }
    }

    @Override
    public void deletar(Long id) {
        empresaRepository.deleteById(String.valueOf(id));
    }
}
