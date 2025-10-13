package com.HellPassHospital.Hospital.Models;

import com.HellPassHospital.Hospital.Classes.Rol;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String contraseña;

    private String nombreUsuario;

    @Enumerated(EnumType.STRING)
    private Rol rol;
}
