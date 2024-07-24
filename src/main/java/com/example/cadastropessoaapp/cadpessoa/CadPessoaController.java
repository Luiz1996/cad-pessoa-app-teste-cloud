package com.example.cadastropessoaapp.cadpessoa;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/pessoa")
public class CadPessoaController {

  private final PessoaRepository pessoaRepository;

  @GetMapping("/{id}")
  public PessoaEntity getPessoaPorId(@PathVariable("id") Long id) {
    return pessoaRepository
        .findById(id)
        .orElseThrow(() -> new RuntimeException("Falhouuuuuuuu!"));
  }
}
