package dio.MyFirstProjectPatterns.controller;

import dio.MyFirstProjectPatterns.model.Funcionario;
import dio.MyFirstProjectPatterns.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository repository;

        @PostMapping("/usuarios")
        public void post(@RequestBody Funcionario funcionario){
            repository.save(funcionario);
        }
        @PutMapping("/usuarios")
        public void put(@RequestBody Funcionario funcionario){
            repository.update(funcionario);
        }
        @GetMapping("/usuarios")
        public Iterable<Funcionario> getAll(){
            return repository.findAll();
        }
        @GetMapping("/usuario/{id}")
        public Optional<Funcionario> getOne(@PathVariable("id") Integer id){
            return repository.findById(Long.valueOf(id));
        }
        @DeleteMapping("/usuarios/{id}")
        public void delete(@PathVariable("id") Integer id){
            repository.delete(new Funcionario());
        }
}

