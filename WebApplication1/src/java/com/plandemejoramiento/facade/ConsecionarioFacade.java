/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plandemejoramiento.facade;

import com.plandemejoramiento.entitis.Consecionario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Has
 */
@Stateless
public class ConsecionarioFacade extends AbstractFacade<Consecionario> {

    @PersistenceContext(unitName = "WebApplication1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConsecionarioFacade() {
        super(Consecionario.class);
    }
    
}
