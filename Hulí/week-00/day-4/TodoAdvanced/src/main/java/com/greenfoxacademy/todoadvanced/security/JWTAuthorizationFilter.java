package com.greenfoxacademy.todoadvanced.security;

import com.greenfoxacademy.todoadvanced.models.ApplicationUser;
import com.greenfoxacademy.todoadvanced.services.CustomUserDetailService;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.greenfoxacademy.todoadvanced.security.SecurityConstants.HEADER_STRING;
import static com.greenfoxacademy.todoadvanced.security.SecurityConstants.SECRET;
import static com.greenfoxacademy.todoadvanced.security.SecurityConstants.TOKEN_PREFIX;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {
  private final CustomUserDetailService customUserDetailService;

  public JWTAuthorizationFilter(AuthenticationManager authenticationManager, CustomUserDetailService customUserDetailService) {
    super(authenticationManager);
    this.customUserDetailService = customUserDetailService;
  }

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
    String header = request.getHeader(HEADER_STRING);
    if (header == null) {
      chain.doFilter(request, response);
      return;
    }

    UsernamePasswordAuthenticationToken usernamePasswordAuth = getAuthenticationToken(request);
    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuth);
    chain.doFilter(request, response);
  }

  private UsernamePasswordAuthenticationToken getAuthenticationToken (HttpServletRequest request) {
    String token = request.getHeader(HEADER_STRING);
    String username = Jwts.parser()
        .setSigningKey(SECRET)
        .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
        .getBody()
        .getSubject();

    UserDetails userDetails = customUserDetailService.loadUserByUsername(username);
    ApplicationUser applicationUser = customUserDetailService.loadApplicationUserByUsername(username);

    return username != null ? new UsernamePasswordAuthenticationToken(applicationUser, null, userDetails.getAuthorities()) : null;

  }
}
