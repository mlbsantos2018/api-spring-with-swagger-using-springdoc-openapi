package com.devmayconn.apispringwithswagger.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping(path = "/users")
@Tag(name = "Users", description = "Users controller API")
public class UserController {


	@Operation(summary = "Obtém uma lista de users", description = "Obtém uma lista de users")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK - Operação realizada com sucesso"),
			@ApiResponse(responseCode = "401", description = "Unauthorized - Acesso não autorizado"),
			@ApiResponse(responseCode = "403", description = "Forbidden - Acesso negado"),
			@ApiResponse(responseCode = "404", description = "Not Found - Recurso não encontrado")
	})
    @GetMapping("/")
    public String getUsers() {
        return "Endpoint de teste";
    }

	@Operation(summary = "Obtém um usuário pelo nome", description = "Obtém um usuário pelo nome")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK - Operação realizada com sucesso"),
			@ApiResponse(responseCode = "401", description = "Unauthorized - Acesso não autorizado"),
			@ApiResponse(responseCode = "403", description = "Forbidden - Acesso negado"),
			@ApiResponse(responseCode = "404", description = "Not Found - Recurso não encontrado")
	})
    @GetMapping("/{name}")
    public String getUser(@PathVariable String name) {
        return "Olá "+ name + ", Seja bem vindo ao nosso sistema!!!!";
    }
}
