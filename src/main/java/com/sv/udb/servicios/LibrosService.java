/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.servicios;

import java.util.List;
import com.sv.udb.modelos.Libros;

public interface LibrosService {
    public void guarLibr(Libros libro);	 
    public List<Libros> consTodo(); 
    public void elimLibr(Integer codiLibro); 
    public Libros actuLibr(Libros libro); 
    public Libros consLibr(int codiLibro);
}
