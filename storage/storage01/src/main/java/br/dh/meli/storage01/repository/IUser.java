package br.dh.meli.storage01.repository;

import br.dh.meli.storage01.model.UserBD;
import org.springframework.data.repository.CrudRepository;

public interface IUser extends CrudRepository<UserBD, Long> {

}
