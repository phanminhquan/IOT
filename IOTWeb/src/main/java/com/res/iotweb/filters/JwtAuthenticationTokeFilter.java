package com.res.iotweb.filters;

import com.res.iotweb.component.JwtService;
import com.res.iotweb.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class JwtAuthenticationTokeFilter extends UsernamePasswordAuthenticationFilter {
    private final static String TOKEN_HEADER = "authorization";
//    @Autowired
//    private JwtService jwtService;
//    @Autowired
//    private User user;
}
