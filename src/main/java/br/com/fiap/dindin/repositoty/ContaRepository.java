package br.com.fiap.dindin.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.dindin.models.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {
    
}
