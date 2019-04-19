package in.arya.auth.user.service;

import in.arya.auth.model.Credentials;

public interface UserService {

	Credentials getUser(String name);
}
