package com.rest.jwt.configs;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

//public class JwtFilter /*extends BasicAuthenticationFilter */{
//    public JwtFilter(AuthenticationManager authenticationManager) {
//        super(authenticationManager);
//    }
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
//
//        String header = request.getHeader("Authorization");
//        UsernamePasswordAuthenticationToken authResult = getAutheticationByToken(header);
//        SecurityContextHolder.getContext().setAuthentication(authResult);
//    }
//
//    private UsernamePasswordAuthenticationToken getAutheticationByToken(String header) {
//
//        Jws<Claims> claimsJws = Jwts.parser().setSigningKey("7aPc$VED<-Qr8)E".getBytes())
//                .parseClaimsJws(header.replaceAll("Bearer " , ""));
//
//        String username = claimsJws.getBody().get("name").toString();
//        String role  = claimsJws.getBody().get("role").toString();
//        Set<SimpleGrantedAuthority> simpleGrantedAuthoritySet = Collections.singleton(new SimpleGrantedAuthority (role));
//        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
//                new UsernamePasswordAuthenticationToken (username , null , simpleGrantedAuthoritySet);
//        return usernamePasswordAuthenticationToken;
//    }


//}
