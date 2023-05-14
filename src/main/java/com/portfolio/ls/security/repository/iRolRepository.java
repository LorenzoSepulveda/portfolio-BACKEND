
package com.portfolio.ls.Security.Repository;

import com.portfolio.ls.Security.Entity.Rol;
import com.portfolio.ls.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lor_b
 */
@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
