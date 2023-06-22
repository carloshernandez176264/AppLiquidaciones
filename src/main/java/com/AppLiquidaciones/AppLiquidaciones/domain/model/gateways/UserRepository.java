package com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.user.User;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.user.attributes.Username;
import reactor.core.publisher.Mono;

public interface UserRepository {

    Mono<User> save(User user);

    Mono<User> findByUsername(Username username);

    Mono<User> update(User user);

    Mono<User> delete(Username username);

    Mono<User> findById(Integer id);

    Mono<User> findByUsernameAndPassword(Username username, String password);

    boolean login(String userName, String password);

    boolean logout();

    boolean isLogged();
}
