package com.wcs.Security.config;

import com.wcs.Security.enums.RoleName;
import com.wcs.Security.models.Role;
import com.wcs.Security.repositories.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final RoleRepository roleRepo;

    public DataInitializer(RoleRepository roleRepository) {
        this.roleRepo = roleRepository;
    }

    @Override
    public void run(String... args) {
        for (RoleName role : RoleName.values()) {
            roleRepo.save(new Role(null, role));
        }
    }
}

