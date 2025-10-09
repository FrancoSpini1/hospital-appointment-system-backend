package com.HellPassHospital.Hospital.IServices;

import com.HellPassHospital.Hospital.Models.Paciente;
import com.HellPassHospital.Hospital.Models.Turno;
import com.HellPassHospital.Hospital.Repositories.PacienteRepository;
import com.HellPassHospital.Hospital.Repositories.TurnoRepository;
import com.HellPassHospital.Hospital.Services.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class ITurnoService implements TurnoService {
    @Autowired
    private TurnoRepository tr;
    @Autowired
    private PacienteRepository pr;

    @Override
    public Turno getTurnoById(Long id) {
        return tr.findById(id).orElse(null);
    }

    @Override
    public List<Turno> getTurnos() {
        return tr.findAll();
    }


    @Override
    public void setTurno(Turno nt) {
        nt.setFechaTurno(LocalDate.now());
        nt.setHoraTurno(LocalTime.now());
        Turno tmp = nt;
        tr.save(nt);
    }
    /*
    esto es asi, por algun motivo que desconozco los  pacientes no tenian los turnos
    guardados en su lista, mi idea es que los tengan, (o sino puedo hacer un metodo en
    'ITurnoService' que segun la id del paciente me trae sus respectivos turnos y con eso
    puedo borrar el campo turnos de la clase)

    otra cosa, en la base de datos se hace la tabla 'pacientes-turnos' con las ids
    de los turnos relacionados a los pacientes, pero esta vacia (preguntonta pero
    ¿eso será porque el campo 'turnos' de los pacientes es una lista vacia?)
     */

    @Override
    public void updateTurno(Long id, Turno nt) {        //lo veo innecesario
        Turno tmp=tr.findById(id).orElse(null);
        tr.delete(tmp);
        tr.save(nt);
    }

    @Override
    public void deleteTurnoById(Long id) {
        tr.deleteById(id);
    }

    @Override
    public List<Turno> getTurnosByIdPaciente(Long idPaciente) {
        return tr.findByIdPaciente(idPaciente);
    }
}
