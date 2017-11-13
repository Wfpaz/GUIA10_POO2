/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.dao;

import com.sv.udb.modelos.Libros;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LibrosDAOImpl implements LibrosDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public void guarLibr(Libros libro) {
        sessionFactory.getCurrentSession().saveOrUpdate(libro);
    }

    @SuppressWarnings("unchecked")
    public List<Libros> consTodo() {
        return sessionFactory.getCurrentSession().createQuery("from Libros").list();
    }

    public void elimLibr(Integer codiLibro) {
        Libros libro = (Libros) sessionFactory.getCurrentSession().load(Libros.class, codiLibro);
        
        if (null != libro) {
            this.sessionFactory.getCurrentSession().delete(libro);
        }
    }

    public Libros actuLibr(Libros libro) {
        sessionFactory.getCurrentSession().update(libro);
        return libro;
    }

    public Libros consLibr(int codiLibro) {
        return (Libros) sessionFactory.getCurrentSession().get(Libros.class, codiLibro);
    }
    
}
