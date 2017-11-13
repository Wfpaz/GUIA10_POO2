package com.sv.udb.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sv.udb.dao.TiposDAO;
import com.sv.udb.modelos.Tipos;

@Service
@Transactional
public class TiposServiceImpl implements TiposService {

    @Autowired
    private TiposDAO tiposDAO;

    public void guarTipo(Tipos tipo) {
        tiposDAO.guarTipo(tipo);
    }

    public List<Tipos> consTodo() {
        return tiposDAO.consTodo();
    }

    public void elimTipo(Integer codiTipo) {
        tiposDAO.elimTipo(codiTipo);

    }

    public Tipos actuTipo(Tipos tipo) {
        return tiposDAO.actuTipo(tipo);
    }

    public Tipos consTipo(int codiTipo) {
        return tiposDAO.consTipo(codiTipo);
    }

}
