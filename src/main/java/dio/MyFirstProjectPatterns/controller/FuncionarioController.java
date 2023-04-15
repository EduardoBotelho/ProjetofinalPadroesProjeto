package dio.MyFirstProjectPatterns.controller;

import dio.MyFirstProjectPatterns.Service.FuncionarioService;
import dio.MyFirstProjectPatterns.model.Funcionario;
import dio.MyFirstProjectPatterns.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @Autowired
    private FuncionarioRepository repository;

    @GetMapping("/buscarTodos")
    public ResponseEntity<Iterable<Funcionario>> buscarTodos() {
        return ResponseEntity.ok(funcionarioService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(funcionarioService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Funcionario> inserir(@RequestBody Funcionario funcionario) {
        funcionarioService.inserir(funcionario);
        return ResponseEntity.ok(funcionario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> atualizar(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        funcionarioService.atualizar(id, funcionario);
        return ResponseEntity.ok(funcionario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        funcionarioService.deletar(id);
        return ResponseEntity.ok().build();
    }
}

