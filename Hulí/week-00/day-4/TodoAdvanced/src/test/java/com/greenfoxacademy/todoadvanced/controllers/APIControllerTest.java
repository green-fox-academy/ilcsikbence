package com.greenfoxacademy.todoadvanced.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.todoadvanced.security.JWTAuthenticationFilter;
import com.greenfoxacademy.todoadvanced.security.JWTAuthorizationFilter;
import com.greenfoxacademy.todoadvanced.security.SecurityConstants;
import com.greenfoxacademy.todoadvanced.services.TodoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.Charset;

import static org.springframework.security.test.web.reactive.server.SecurityMockServerConfigurers.springSecurity;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(APIController.class)
public class APIControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;
  @Autowired
  private ObjectMapper objectMapper;
  @Autowired
  private APIController apiController;

  @MockBean
  JWTAuthenticationFilter authenticationFilter;

  @MockBean
  JWTAuthorizationFilter authorizationFilter;

  @MockBean
  SecurityConstants securityConstants;

  @MockBean
  private TodoService todoService;

  @Autowired
  WebApplicationContext webApplicationContext;

  @Test
  public void shouldLoginToApplication() throws Exception {
    HttpSessionCsrfTokenRepository httpSessionCsrfTokenRepository = new HttpSessionCsrfTokenRepository();
    CsrfToken csrfToken = httpSessionCsrfTokenRepository.generateToken(new MockHttpServletRequest());

    mockMvc.perform(post("/login")
        .sessionAttr("org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository.CSRF_TOKEN‌​", csrfToken)
        .with(csrf())
//        .with(user("test").password("test")
//        .authorities(new SimpleGrantedAuthority("USER")))
        .contentType(contentType)
        .content("{\"username:\": \"admin\", \"password\": \"admin\"}"))
        .andExpect(status().isOk())
        .andDo(print());

  }

  @Test
  @WithMockUser(username = "admin", password = "admin")
  public void shouldCreateNewTodo() throws Exception {
    HttpSessionCsrfTokenRepository httpSessionCsrfTokenRepository = new HttpSessionCsrfTokenRepository();
    CsrfToken csrfToken = httpSessionCsrfTokenRepository.generateToken(new MockHttpServletRequest());

    mockMvc.perform(post("/api/todo/new")
//        .sessionAttr("org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository.CSRF_TOKEN‌​", csrfToken)
//        .with(csrf())
        .contentType(contentType)
        .content("{\"content:\": \"something\"}"))
        .andExpect(status().isOk())
        .andDo(print());

  }

}