package com.HellPassHospital.Hospital.IServices;

import com.HellPassHospital.Hospital.Models.Medico;
import com.HellPassHospital.Hospital.Repositories.MedicoRepository;
import com.HellPassHospital.Hospital.Services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMedicoService implements MedicoService {
    @Autowired
    private MedicoRepository mr;

    @Override
    public Medico getMedicoById(Long id) {
        return mr.findById(id).orElse(null);
    }

    @Override
    public List<Medico> getMedicos() {
        return mr.findAll();
    }

    @Override
    public void postMedico(Medico nm) {
        mr.save(nm);
    }

    @Override
    public void updateMedico(Long id,Medico nm) {
        Medico tmp = mr.findById(id).orElse(null);
        mr.delete(tmp);
        mr.save(nm);
    }

    @Override
    public void deleteMedicoById(Long id) {
        mr.deleteById(id);
    }
}
