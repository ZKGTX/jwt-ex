package com.zerokikr.jwtex.repositories;

import com.zerokikr.jwtex.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository <User, Long> {

    User findByLogin (String login);
}
