package com.example.demo.controller;


import com.example.demo.config.Constants;
import com.example.demo.config.JwtTokenUtil;
import com.example.demo.entity.AuthToken;
import com.example.demo.entity.LoginUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.naming.AuthenticationException;
import java.util.Date;

@RestController
@RequestMapping("/token")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    @Qualifier("userService")
    private UserDetailsService userService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping(value = "/generate-token")
    public AuthToken register(@RequestBody LoginUser loginUser) throws AuthenticationException {
        UserDetails userDetails = userService.loadUserByUsername(loginUser.getLogin());

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                userDetails, userDetails.getPassword(), userDetails.getAuthorities()
        );

        authenticationManager.authenticate(authenticationToken);

        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        final  String token = jwtTokenUtil.generateToken(authenticationToken);
        return new AuthToken(token);
    }

    @GetMapping(value = "/expDate")
    public Date GetExpDate(@PathVariable String token){
        token = token.replace(Constants.TOKEN_PREFIX, "");
        return jwtTokenUtil.getExpirationDateFromToken(token);
    }

}
