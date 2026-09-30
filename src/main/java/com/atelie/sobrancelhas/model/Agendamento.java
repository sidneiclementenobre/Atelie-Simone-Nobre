package com.atelie.sobrancelhas.model;

import org.springframework.format.annotation.DateTimeFormat; 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data                 // Cria automaticamente Getters, Setters, equals, hashCode e toString via Lombok
@NoArgsConstructor    // Cria o construtor padrão sem argumentos (obrigatório para o Hibernate/JPA)
@AllArgsConstructor   // Cria o construtor com todos os parâmetros
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String servico;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataAgendamento;

    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime horaAgendamento;
}


