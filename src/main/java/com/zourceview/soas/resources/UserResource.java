package com.zourceview.soas.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zourceview.soas.jpa.User;
import com.zourceview.soas.jpa.repository.UserRepository;

@RestController
@RequestMapping(value = "/rest/users")
public class UserResource {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {
	LOGGER.info("List Users");
	return userRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User create(@RequestBody User user) {
	LOGGER.info("Create user {}", user);

	// Create new user object
	// Save to DB
	// return it
	User savedUser = userRepository.save(user);
	return savedUser;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable Long id) {
	LOGGER.info("Find user by id = {}", id);

	// Find user from DB
	// return it
	User user = userRepository.findOne(id);
	return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public User updateById(@PathVariable Long id, @RequestParam(value = "fname", required = true) String fname) {
	LOGGER.info("Find user by id ={} . Updating first name to {}", id, fname);

	// Find user from DB
	// Set new name
	// Save to DB

	User user = userRepository.findOne(id);
	user.setFname(fname);
	User savedUser = userRepository.save(user);
	return savedUser;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
	LOGGER.info("Delete user by id = {}", id);

	// delete user from DB
	userRepository.delete(id);
    }

}
