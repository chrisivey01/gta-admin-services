package com.chris.pmagtaservices.controller;

import com.chris.pmagtaservices.model.Users;
import com.chris.pmagtaservices.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class UsersController {

    private UsersRepository usersRepository;

    @Autowired
    UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/get-users")
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    public static class OwnedPropertiesController {
    }

    public static class OwnedVehiclesController {
    }

    public static class TrunkInventoryController {
    }

    public static class UserInventoryController {
    }
}
