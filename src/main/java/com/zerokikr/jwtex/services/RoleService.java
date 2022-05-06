package com.zerokikr.jwtex.services;

import com.zerokikr.jwtex.repositories.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private  RolesRepository rolesRepository;

}
