package com.devmayconn.apispringwithswagger.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping(path = "/users")
@Api(value = "Endpoint de Users da API", description = "Endpoint de Users da API")
public class UserController {

    @ApiOperation(value = "Obter uma lista de Users", notes = "Retorna uma lista de users")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
            @ApiResponse(code = 404, message = "Não foram encontrados objetos"),
            @ApiResponse(code = 401, message = "Unauthorized - Acesso não autorizado"),
            @ApiResponse(code = 403, message = "Forbidden - Acesso negado")
    })
    @GetMapping("/")
    public String getUsers() {
        return "Endpoint de teste";
    }

    @ApiOperation(value = "Obter uma user por nome", notes = "Retorna um user pelo nome")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
            @ApiResponse(code = 404, message = "Não foram encontrados objetos"),
            @ApiResponse(code = 401, message = "Unauthorized - Acesso não autorizado"),
            @ApiResponse(code = 403, message = "Forbidden - Acesso negado")
    })
    @GetMapping("/{name}")
    public String getUser(@PathVariable String name) {
        return "Olá "+ name;
    }
}
