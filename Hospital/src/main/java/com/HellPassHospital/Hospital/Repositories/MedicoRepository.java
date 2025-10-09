package com.HellPassHospital.Hospital.Repositories;

import com.HellPassHospital.Hospital.Models.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico,Long>{
}
