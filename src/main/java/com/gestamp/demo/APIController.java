package com.gestamp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/dato")
public class APIController {
    @Autowired
    private DatoRepository datoRepository;
    @GetMapping
    public List<Dato> showDato(){
        return this.datoRepository.findAll();
    }
    @RequestMapping(
            value = "",
            method = RequestMethod.POST)
    public Dato addDato(@RequestBody Dato dato) {
        this.datoRepository.save(dato);
        return dato;
    }
    @GetMapping("/{id}")
    public Dato showDatoById(@PathVariable("id") Long id){
        Dato d = this.datoRepository.getOne(id);
        System.out.println(d);
        return d;
    }
    @RequestMapping(value = "/{id}",method =
            RequestMethod.PUT)
    public Dato editDatoById(
            @PathVariable("id") Long id,
            @RequestBody Dato dato)
            throws ServletException, IOException {
        Dato datoG = this.datoRepository.getOne(id);
        datoG.setCadena(dato.getCadena());
        this.datoRepository.save(datoG);
        return datoG;
    }
    @RequestMapping(value = "/{id}",method =
            RequestMethod.DELETE)
    public Dato deleteDatoById(@PathVariable Long id){
        Dato dato= this.datoRepository.getOne(id);
        this.datoRepository.delete(dato);
        return dato;
    }
}
