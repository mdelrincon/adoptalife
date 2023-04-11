package org.mdelrincon.adoptalife.msvc.usuarios.services;

import org.mdelrincon.adoptalife.msvc.usuarios.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> listar();

    Optional<Usuario> porId(Long id); //Optional para evitar nulles (el null pointer exception)

    Optional<Usuario> porDNI(String DNI); //Optional para evitar nulles (el null pointer exception)

    Usuario guardar(Usuario usuario);
    void eliminar(Long id);


    List<Usuario> buscarUsuariosPorIDs(Iterable<Long> ids);

}
