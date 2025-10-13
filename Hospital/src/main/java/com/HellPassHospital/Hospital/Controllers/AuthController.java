package com.HellPassHospital.Hospital.Controllers;

import com.HellPassHospital.Hospital.Classes.LoginRequest;
import com.HellPassHospital.Hospital.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {
    @Autowired
    private AuthService as;

//    @PostMapping("login")
//    public ResponseEntity<?> login(@RequestBody LoginRequest request){
//        return ResponseEntity.ok(as.login(request));
//    }

    /*
    * que hice de nuevo (hoy 12-10)
    *1) agregue clas authcontroller
    * 2) agregue authService y IauthService
    * 3)cree clase usuario con enum rol para que paciente tenga eso en lugar de 2 campos user y pswrd
    * 4) como no me anduvo y no tuve paciencia comenté TODO jajaja
    *                                                   */
}
