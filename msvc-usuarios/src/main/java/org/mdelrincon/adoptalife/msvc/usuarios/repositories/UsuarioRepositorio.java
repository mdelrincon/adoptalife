package org.mdelrincon.adoptalife.msvc.usuarios.repositories;

import org.mdelrincon.adoptalife.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepositorio extends CrudRepository<Usuario,Long> {

    Optional<Usuario> findByDNI(String dni);

    @Query("select u from Usuario where u.DNI=?1")
    Optional<Usuario> porQueryDNI(String dni);

    boolean existsByDNI(String dni);


}
