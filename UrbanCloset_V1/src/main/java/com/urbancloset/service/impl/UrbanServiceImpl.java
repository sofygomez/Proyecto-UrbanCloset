
package com.urbancloset.service.impl;

import com.urbancloset.dao.UrbanDao;
import com.urbancloset.domain.UrbanDomain;
import com.urbancloset.service.UrbanService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class UrbanServiceImpl implements UrbanService{

    @Autowired
    private UrbanDao UrbanDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<ropa> getropa(boolean nombre_comun) {
        var lista = UrbanDao.findAll();
        return lista;    }
    
}
