package com.HellPassHospital.Hospital.Repositories;

import com.HellPassHospital.Hospital.Models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Long> {
}
