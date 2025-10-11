package com.HellPassHospital.Hospital.Repositories;

import com.HellPassHospital.Hospital.Models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Long> {
    @Query("SELECT p FROM Paciente p WHERE p.nombreCompleto LIKE '%' || :nombre || '%'")
    List<Paciente> findPacienteByNombreCompleto(String nombre);
}
