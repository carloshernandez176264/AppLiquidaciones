package com.AppLiquidaciones.AppLiquidaciones.domain.usecase;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.UserRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserUseCase {

    private final UserRepository userRepository;

    public boolean login(String email, String password) {
        return userRepository.login(email, password);
    }

    public boolean logout() {
       return userRepository.logout();
    }

    public boolean isLogged() {
        return userRepository.isLogged();
    }


}
