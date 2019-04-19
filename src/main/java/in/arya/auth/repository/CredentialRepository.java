package in.arya.auth.repository;

import org.springframework.data.repository.CrudRepository;

import in.arya.auth.model.Credentials;

public interface CredentialRepository extends CrudRepository<Credentials, Long> {

	Credentials findByName(String name);
}
