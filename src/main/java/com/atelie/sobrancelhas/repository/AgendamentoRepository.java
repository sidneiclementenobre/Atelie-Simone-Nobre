package com.atelie.sobrancelhas.repository;

import com.atelie.sobrancelhas.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    // Pronto! Métodos como .save() já vêm prontos por padrão aqui.
}
