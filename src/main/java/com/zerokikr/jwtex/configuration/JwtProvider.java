package com.zerokikr.jwtex.configuration;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class JwtProvider {

    public String generateToken (String login) {
        Date date = Date.from(LocalDate.now()
                .plusDays(14).atStartOfDay(ZoneId.systemDefault())
                .toInstant());

        return Jwts.builder().setSubject(login)
                .setExpiration(date)
                .signWith(SignatureAlgorithm.HS256, jwtSecret).compact();
    }
}
