package com.HellPassHospital.Hospital.Repositories;

import com.HellPassHospital.Hospital.Models.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicoRepository extends JpaRepository<Medico,Long>{
    @Query("SELECT m FROM Medico m WHERE m.nombreCompleto LIKE '%' || :nombre || '%'")
    List<Medico> findMedicoByNombreCompleto(String nombre);
}
