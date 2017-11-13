/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.servicios;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sv.udb.dao.LibrosDAO;
import com.sv.udb.modelos.Libros;


@Service
@Transactional
public class LibrosServiceImpl implements LibrosService {

    @Autowired
    private LibrosDAO librosDAO;

    public void guarLibr(Libros libro) {
        librosDAO.guarLibr(libro);
    }

    public List<Libros> consTodo() {
        return librosDAO.consTodo();
    }

    public void elimLibr(Integer codiLibro) {
        librosDAO.elimLibr(codiLibro);
    }

    public Libros actuLibr(Libros libro) {
        return librosDAO.actuLibr(libro);
    }

    public Libros consLibr(int codiLibro) {
        return librosDAO.consLibr(codiLibro);
    }
    
    
}
