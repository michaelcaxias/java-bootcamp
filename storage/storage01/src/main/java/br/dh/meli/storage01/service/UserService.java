package br.dh.meli.storage01.service;

import br.dh.meli.storage01.model.UserBD;
import br.dh.meli.storage01.repository.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private IUser repo;

    public UserBD create(UserBD userBD) {
        return repo.save(userBD);
    }

    public UserBD findByCod(long cod) throws Exception {
        Optional<UserBD> user = repo.findById(cod);

        if (user.isEmpty()) {
            throw new Exception("User specified does not exist");
        }

        return user.get();
    }

    public UserBD update(UserBD userBD) {
        return repo.save(userBD);
    }
}
