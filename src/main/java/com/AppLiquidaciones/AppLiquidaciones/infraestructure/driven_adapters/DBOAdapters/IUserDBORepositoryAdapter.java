package com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.DBOAdapters;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.UserRepository;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.user.User;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.user.attributes.Username;
import com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.DBORepositorys.IUserDBORepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@AllArgsConstructor
public class IUserDBORepositoryAdapter implements UserRepository {


    private final IUserDBORepository repository;

    @Override
    public Mono<User> save(User user) {
        return null;
    }

    @Override
    public Mono<User> findByUsername(Username username) {
        return null;
    }

    @Override
    public Mono<User> update(User user) {
        return null;
    }

    @Override
    public Mono<User> delete(Username username) {
        return null;
    }

    @Override
    public Mono<User> findById(Integer id) {
        return null;
    }

    @Override
    public Mono<User> findByUsernameAndPassword(Username username, String password) {
        return null;
    }

    @Override
    public boolean login(String userName, String password) {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }

    @Override
    public boolean isLogged() {
        return false;
    }
}
