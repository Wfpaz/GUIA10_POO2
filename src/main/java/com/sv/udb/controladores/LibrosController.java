/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controladores;

import com.sv.udb.modelos.Libros;
import com.sv.udb.servicios.LibrosService;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = {"/libros"})
public class LibrosController {
    
    private static final Logger logger = Logger.getLogger(Libros.class);
 
    public LibrosController() {
        System.out.println("LibrosController()");
    }
 
    @Autowired
    private LibrosService librosService;
 
    @RequestMapping(value = "/")
    public ModelAndView listTipos(ModelAndView model) throws IOException {
    	List<Libros> listLibros = librosService.consTodo();
        model.addObject("listLibros", listLibros);
        model.setViewName("libros/homeLib");
        return model;
    }
    
    @RequestMapping(value = "/nuevoLibro", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
    	Libros libro = new Libros();
        model.addObject("objeLibro", libro);
        model.setViewName("libros/libroForm");
        return model;
    }
    
    @RequestMapping(value = "/guardarLibro", method = RequestMethod.POST)
    public ModelAndView guarTipo(@ModelAttribute Libros libro) 
    {
      	if (libro.getCodiLibr() == null) { // Si es 0 hay que crearlo
        	librosService.guarLibr(libro);
        } else {
        	librosService.actuLibr(libro);
        }
        return new ModelAndView("redirect:/libros/");
    }
    
    @RequestMapping(value = "/editarLibro", method = RequestMethod.GET)
    public ModelAndView editarTipo(HttpServletRequest request) {
        int codi_libro = Integer.parseInt(request.getParameter("codi"));
        Libros tipo = librosService.consLibr(codi_libro);
        ModelAndView model = new ModelAndView("libros/libroForm");
        model.addObject("objeLibro", tipo);
        return model;
    }
    
    @RequestMapping(value = "/eliminarLibro", method = RequestMethod.GET)
    public ModelAndView eliminarTipo(HttpServletRequest request) {
        int codi_libro = Integer.parseInt(request.getParameter("codi"));
        librosService.elimLibr(codi_libro);
        return new ModelAndView("redirect:/libros/");
    }
}
