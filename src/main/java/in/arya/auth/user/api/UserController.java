package in.arya.auth.user.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.arya.auth.user.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService service) {
		this.userService = service;
	}
	
	@RequestMapping(value="/{user-name}", method=RequestMethod.GET)
	public @ResponseBody Object getUser(@PathVariable("user-name") String userName) {
		return userService.getUser(userName);
	}
}
