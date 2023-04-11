package org.mdelrincon.adoptalife.msvc.usuarios.services;

import org.mdelrincon.adoptalife.msvc.usuarios.models.entity.Usuario;
import org.mdelrincon.adoptalife.msvc.usuarios.repositories.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{


    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listar() {
        return (List<Usuario>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Usuario> porId(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public Optional<Usuario> porDNI(String DNI) {
        return repositorio.findByDNI(DNI);
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return repositorio.save(usuario);
    }

    @Override
    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }


    @Override
    public List<Usuario> buscarUsuariosPorIDs(Iterable<Long> ids) {
        return null;
    }
}
