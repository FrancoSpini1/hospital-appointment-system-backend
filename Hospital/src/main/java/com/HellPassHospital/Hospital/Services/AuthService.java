package com.HellPassHospital.Hospital.Services;

import com.HellPassHospital.Hospital.Classes.LoginRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
     void login(LoginRequest request);
     /*
     * metodo login:
     * este metodo es para que los usuarios (sean pacientes o el admin) se logueen
     * el tema es que esta funcion debe retornar (intuyo) el jwt cuando encuentra el
     * usuario que le pase en @param request, pero ahora estoy medio como bastante perdido
     * */
}
