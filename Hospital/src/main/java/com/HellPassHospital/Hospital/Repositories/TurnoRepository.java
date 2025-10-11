package com.HellPassHospital.Hospital.Repositories;

import com.HellPassHospital.Hospital.Models.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurnoRepository extends JpaRepository<Turno,Long> {
    @Query("SELECT t FROM Turno t WHERE t.paciente.id =:id")
    List<Turno> findByIdPaciente(long id);

    @Query("SELECT t FROM Turno t WHERE t.paciente.id =:id AND t.medico.nombreCompleto LIKE '%' || :nombre || '%'")
    List<Turno> findTurnosByNombreMedicoAndIdPaciente(String nombre,long id);
}
