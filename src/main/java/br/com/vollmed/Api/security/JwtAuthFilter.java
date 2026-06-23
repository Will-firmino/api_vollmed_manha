package br.com.vollmed.Api.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * Classe responsável por extender OncePerRequestFilter do JWT que inclui filtros de segurança para evitar ataques.
 * 
 * 
 */

@Component
public class JwtAuthFilter extends OncePerRequestFilter {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserDetaisService userDetaisService;
    
}
