package in.arya.auth.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arya.auth.model.Credentials;
import in.arya.auth.repository.CredentialRepository;
import in.arya.auth.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private CredentialRepository credentialRepository;

	@Autowired
	public UserServiceImpl(CredentialRepository credentialRepository) {
		this.credentialRepository = credentialRepository;
	}
	
	@Override
	public Credentials getUser(String name) {
		return credentialRepository.findByName(name);
	}
	
}
