package dio.MyFirstProjectPatterns.controller;

import dio.MyFirstProjectPatterns.Service.EmpresaService;
import dio.MyFirstProjectPatterns.model.Empresa;
import dio.MyFirstProjectPatterns.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping("/buscarTodos")
    public ResponseEntity<Iterable<Empresa>> buscarTodos() {
        return ResponseEntity.ok(empresaService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Empresa>> buscarPorId(@PathVariable Long id) {

        return ResponseEntity.ok(empresaService.buscarPorId(id));
    }

    @PostMapping("/inserir")
    public ResponseEntity<Empresa> inserir(@RequestBody Empresa empresa) {
        empresaService.inserir(empresa);
        return ResponseEntity.ok(empresa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empresa> atualizar(@PathVariable Long id, @RequestBody Empresa empresa) {
        empresaService.atualizarEmpresa(id, empresa);
        return ResponseEntity.ok(empresa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        empresaService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
