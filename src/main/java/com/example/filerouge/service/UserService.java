package com.example.filerouge.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDetailsService userDetailsService();
}
