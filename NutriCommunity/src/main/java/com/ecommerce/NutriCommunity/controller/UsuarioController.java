package com.ecommerce.NutriCommunity.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.NutriCommunity.model.UserLogin;
import com.ecommerce.NutriCommunity.model.Usuario;
import com.ecommerce.NutriCommunity.service.UsuarioService;

@RestController
@RequestMapping ("/usuarios")
@CrossOrigin (origins = "*", allowedHeaders = "*")

public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping ("/logar")
	public ResponseEntity<UserLogin> Autentication (@RequestBody Optional<UserLogin> user) {
		return usuarioService.Logar(user).map(resp-> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build() );
		
		
	}
	
	@PostMapping ("/cadastrar")
	public ResponseEntity<Usuario> Post (@RequestBody Usuario usuario) {
		return usuarioService.cadastrarUsuario(usuario)
				.map(resp-> ResponseEntity.status(HttpStatus.CREATED).body(resp))
				.orElse(ResponseEntity.status(HttpStatus.CONFLICT).build() );
		
		
	}
}
