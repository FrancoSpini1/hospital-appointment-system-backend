package com.HellPassHospital.Hospital.IServices;

import com.HellPassHospital.Hospital.Classes.LoginRequest;
import com.HellPassHospital.Hospital.Services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class IAuthService implements AuthService {

    @Override
    public void login(LoginRequest request) {

    }
}
