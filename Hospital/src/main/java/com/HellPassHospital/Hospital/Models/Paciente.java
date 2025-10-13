package com.HellPassHospital.Hospital.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long numeroSocio;
    private String contraseña;
    private String nombreUsuario;
//    @OneToOne(cascade = CascadeType.ALL)    //esto me lo paso el chatyipiti
//    @JoinColumn(name= "idUsuario",referencedColumnName = "id")
//    private Usuario usuario;
    private String nombreCompleto;
    private Long DNI;
    private String nombreObraSocial;

}
