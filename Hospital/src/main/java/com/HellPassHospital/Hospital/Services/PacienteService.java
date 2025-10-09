package com.HellPassHospital.Hospital.Services;

import com.HellPassHospital.Hospital.Models.Paciente;

import java.util.List;

public interface PacienteService {
    public Paciente getPacienteById(Long id);
    public List<Paciente> getPacientes();
    public void setPaciente(Paciente np);
    public void updatePaciente(Long id,Paciente np);
    public void deletePacienteById(Long id);
}
