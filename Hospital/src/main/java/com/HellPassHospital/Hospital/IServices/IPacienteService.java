package com.HellPassHospital.Hospital.IServices;

import com.HellPassHospital.Hospital.Models.Paciente;
import com.HellPassHospital.Hospital.Repositories.PacienteRepository;
import com.HellPassHospital.Hospital.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPacienteService implements PacienteService {
    @Autowired
    private PacienteRepository pr;

    @Override
    public Paciente getPacienteById(Long id) {
        return pr.findById(id).orElse(null);
    }

    @Override
    public List<Paciente> getPacientes() {
        return pr.findAll();
    }

    @Override
    public void setPaciente(Paciente np) {
        pr.save(np);
    }

    @Override
    public void updatePaciente(Long id, Paciente np) {
        Paciente tmp = pr.findById(id).orElse(null);
        pr.delete(tmp);
        pr.save(np);
    }

    @Override
    public void deletePacienteById(Long id) {
        pr.deleteById(id);
    }
}
