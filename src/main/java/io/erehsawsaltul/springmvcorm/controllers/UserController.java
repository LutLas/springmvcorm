package io.erehsawsaltul.springmvcorm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.erehsawsaltul.springmvcorm.entities.User;
import io.erehsawsaltul.springmvcorm.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/registrationPage")
	public String showRegistrationPage() {
		return "userReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, ModelMap model) {
		int result = userService.save(user);
		model.addAttribute("result", "User Created With ID: " + result);

		return "userReg";
	}

	@RequestMapping("/getUsers")
	public String getUsers(ModelMap model) {
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "displayUsers";
	}

	@RequestMapping("/validateId")
	public @ResponseBody String validateId(@RequestParam("id") int id) {
		User user = userService.getUser(id);
		String msg = "";
		if (user != null) {
			msg = id + " already exists";
		}
		return msg;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
