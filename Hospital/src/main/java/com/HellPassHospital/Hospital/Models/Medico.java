package com.HellPassHospital.Hospital.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombreCompleto;
    private Long matricula;
    private String especialidad;
}
