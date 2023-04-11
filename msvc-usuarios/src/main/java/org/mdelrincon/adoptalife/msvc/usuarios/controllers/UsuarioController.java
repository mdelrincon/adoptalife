package org.mdelrincon.adoptalife.msvc.usuarios.controllers;

import org.mdelrincon.adoptalife.msvc.usuarios.models.entity.Usuario;
import org.mdelrincon.adoptalife.msvc.usuarios.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping("/admin/lista")
    public Map<String, List<Usuario>> listar() {
        return Collections.singletonMap("usuarios",service.listar());
    }




}
