package com.example.project;

import com.example.project.service.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AnimalsApplication implements CommandLineRunner {
    private final RoleService roleService;

    public AnimalsApplication(RoleService roleService) {
        this.roleService = roleService;
    }


    @Override
    public void run(String... args) throws Exception {
        roleService.initRole();
    }
}
