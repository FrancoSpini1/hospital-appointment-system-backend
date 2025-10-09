package com.HellPassHospital.Hospital.Services;

import com.HellPassHospital.Hospital.Models.Turno;

import java.util.List;

public interface TurnoService {
    public Turno getTurnoById(Long id);
    public List<Turno> getTurnos();
    public void setTurno(Turno nt);
    public void updateTurno(Long id,Turno nt);
    /*//no se si poner el metodo de arriba pq mas que editar un turno lo mejor seria
    borrarlo y sacar uno nuevo*/

    public void deleteTurnoById(Long id);
    public List<Turno> getTurnosByIdPaciente(Long idPaciente);
}
