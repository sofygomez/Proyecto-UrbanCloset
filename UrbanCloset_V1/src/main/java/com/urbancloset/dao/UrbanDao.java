
package com.urbancloset.dao;

import com.urbancloset.domain.UrbanDomain;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UrbanDao extends JpaRepository <UrbanDomain,Long>{
    
}
