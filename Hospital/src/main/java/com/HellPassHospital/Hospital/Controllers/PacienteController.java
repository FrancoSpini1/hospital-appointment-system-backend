package com.HellPassHospital.Hospital.Controllers;

import com.HellPassHospital.Hospital.Models.Paciente;
import com.HellPassHospital.Hospital.Models.Turno;
import com.HellPassHospital.Hospital.Services.PacienteService;
import com.HellPassHospital.Hospital.Services.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    private PacienteService ps;
    @Autowired
    private TurnoService ts;
    //el paciente solo puede modificar y ver sus datos --listo ✔

    @PutMapping("editar/{id}")
    public void editarPaciente(@PathVariable Long id, @RequestBody Paciente np){
        ps.updatePaciente(id,np);
    }

    @GetMapping("VerDatos/{id}")
    public Paciente getPaciente(@PathVariable Long id){
        return ps.getPacienteById(id);
    }

    //el paciente puede hacer crud de turnos;

    @GetMapping("verMisTurnos/{id}")
    public List<Turno> getTurnos(@PathVariable Long id){
        return  ts.getTurnosByIdPaciente(id);
    }

    @GetMapping("verMisTurnosPorNombreDeMedico")
    public List<Turno> getTurnosDeMedicoNombre(@RequestParam String nombre,@RequestParam Long id){
        return ts.getTurnosDeXMedicoByIdPaciente(nombre,id);
    }
/*logica de endpoint "verMisTurnos"
* la idea es que cuando el front este consumiendo el endpoint, se le pase la id de los que
* seria el paciente que esta con "sesion abierta".
*
* el metodo funciona, gracias a dios, el paciente APARENTEMENTE no necesita su campo
* 'turnos' en su clase*/

    @PostMapping("sacarTurno")
    public void setTurno(@RequestBody Turno nt){
        ts.setTurno(nt);
    }

    /*
    logica endpoint POST "sacarTurno":
    el objeto 'nt' tiene dentro la id del paciente (no se si iria mejor un DTO en este caso).
    se guarda en la base de datos y despues en la tabla TURNOS-PACIENTES deberian aparecer las keys
     */

    @DeleteMapping("borrarTurno/{idTurno}")
    public void borrarTurno(@PathVariable Long idTurno){
        ts.deleteTurnoById(idTurno);
    }

    /*
    DUDA, generalmente uno no modifica el turno, o no conozco casos donde se pueda
    para mi lo mejor seria que el paciente solo tenga alta baja y lectura de los turnos
     */
}
