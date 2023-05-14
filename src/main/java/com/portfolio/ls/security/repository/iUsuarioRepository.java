
package com.portfolio.ls.Security.Repository;

import com.portfolio.ls.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    
    public boolean existsByNombreUsuario(String nombreUsuario);
    public boolean existsByEmail(String email);
}
