package com.HellPassHospital.Hospital.Services;

import com.HellPassHospital.Hospital.Models.Medico;

import java.util.List;

public interface MedicoService {

     Medico getMedicoById(Long id);
     List<Medico> getMedicos();
     void postMedico(Medico nm);
    void updateMedico(Long id,Medico nm);
     void deleteMedicoById(Long id);

    List<Medico> getMedicosPorNombre(String nombre);
}
