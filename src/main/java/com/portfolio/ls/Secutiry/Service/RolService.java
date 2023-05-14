
package com.portfolio.ls.Secutiry.Service;

import com.portfolio.ls.Security.Entity.Rol;
import com.portfolio.ls.Security.Enums.RolNombre;
import com.portfolio.ls.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lor_b
 */
@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
            
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    
    }
}
