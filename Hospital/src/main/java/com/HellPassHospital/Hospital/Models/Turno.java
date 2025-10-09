package com.HellPassHospital.Hospital.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "turnos")
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private LocalDate fechaTurno;
    private LocalTime horaTurno;
    @OneToOne
    @JoinColumn(name="idPaciente",referencedColumnName = "id")
    private Paciente paciente;
    @OneToOne
    @JoinColumn(name="idMedico",referencedColumnName = "id")
    private Medico medico;
}
