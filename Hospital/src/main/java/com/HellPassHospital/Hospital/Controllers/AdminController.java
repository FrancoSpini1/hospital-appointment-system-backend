package com.HellPassHospital.Hospital.Controllers;

import com.HellPassHospital.Hospital.Models.Medico;
import com.HellPassHospital.Hospital.Models.Paciente;
import com.HellPassHospital.Hospital.Services.MedicoService;
import com.HellPassHospital.Hospital.Services.PacienteService;
import com.HellPassHospital.Hospital.Services.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("admin")
@RestController
public class AdminController {
    /*
    admin:
    el admin podria decirse que es un controlador el cual va a ser usado por
    personal del hospital encargado de la gestion de los datosdel hospital,
    va a estar a cargo de:
        1)gestionar pacientes (alta, baja, modificacion, eliminacion y lectura)
        2)gestionar info de medicos (alta, baja modificacion eliminacion y lectura)
        3)con los turnos de momento lectura y eliminacion (creo que otra cosa no puede)
    por eso posee campos service de las 3 entidades
    duda*, nose si merece que le haga una entidad, no creo que valga a pena
    crear una clase 'admin' (ni idea).
     */

    @Autowired
    private PacienteService ps;
    @Autowired
    MedicoService ms;
//    @Autowired
//    TurnoService ts;

    //CRUD paciente
    @PostMapping("crearPaciente")
    public void setPaciente(@RequestBody Paciente pn){
        ps.setPaciente(pn);
    }

    @GetMapping("obtenerPaciente/{id}")
    public Paciente getPaciente(@PathVariable Long id){
        return ps.getPacienteById(id);
    }

    @GetMapping("obtenerPacientes")
    public List<Paciente> getPacientes(){
        return ps.getPacientes();
    }

    @GetMapping("obtenerPacientesPorNombre/{nombre}")
    public List<Paciente> obtenerPacientesPorNombre(@PathVariable String nombre){
        return ps.getPacientesPorNombre(nombre);
    }
    @PutMapping("editarPaciente/{id}")
    public void updatePaciente(@RequestBody Paciente pn,Long id){
        ps.updatePaciente(id,pn);
    }

    @DeleteMapping("borrarPaciente/{id}")
    public void deletePaciente(@PathVariable Long id){
        ps.deletePacienteById(id);
    }

    //CRUD medicos:

    @PostMapping("crearMedico")
    public void setMedico(@RequestBody Medico nm){ms.postMedico(nm);}

    @GetMapping("obtenerMedico/{id}")
    public Medico getMedico(@PathVariable Long id){return ms.getMedicoById(id);}

    @GetMapping("obtenerMedicos")
    public List<Medico> getMedicos(){return ms.getMedicos();}

    @GetMapping("obtenerMedicosPorNombre/{nombre}")
    public List<Medico> getMedicosPorNombre(@PathVariable String nombre){
        return ms.getMedicosPorNombre(nombre);
    }
    @PutMapping("editarMedico/{id}")
    public void updateMedico(@RequestBody Medico nm,@PathVariable Long id){
        ms.updateMedico(id,nm);
    }

    @DeleteMapping("borrarMedico/{id}")
    public void borrarMedico(@PathVariable Long id){
        ms.deleteMedicoById(id);
    }


    /*
    datasos

    1) por algun motivo el borrarMedico funca, pero no puede borrar los registros
     de id 2 y 3 ubicados en 'src/main/resources/data.sql'.
     */
}
