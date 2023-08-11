package cl.rest.especialista.integracion.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.rest.especialista.integracion.entity.UsersEntity;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity, String> {

	Optional<UsersEntity> findByEmail(String email);
	
	Optional<UsersEntity> existsByEmailAndPass(String email, String pass);
	
	Optional<UsersEntity> existsByidUser(String idUser);
	
	
    @Query(value ="SELECT "
    		+ "up "
    		+ "FROM UsersEntity up "
    		+ "")
	List<UsersEntity> andPhoneMixed();
	
	
	
}
