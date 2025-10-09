package com.HellPassHospital.Hospital.Services;

import com.HellPassHospital.Hospital.Models.Medico;

import java.util.List;

public interface MedicoService {

    public Medico getMedicoById(Long id);
    public List<Medico> getMedicos();
    public void postMedico(Medico nm);
    public void updateMedico(Long id,Medico nm);
    public void deleteMedicoById(Long id);
}
