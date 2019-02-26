package com.test.clase.demo.controller;

import com.test.clase.demo.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;


@Controller
@RequestMapping("/cv")
public class CvControler {

    @GetMapping(value = "/datos")
    public String obtenerDatos(Model model) {
        Person p = new Person();
        p.setApellidoMaterno("Millan ");
        p.setApellidoPaterno("Fernandez ");
        p.setNombre("Danya Lorena ");
        p.setFechaNacimiento("16 de junio del 1998");
        p.setTelefono(5630553);
        p.setDireccion("Av. Valle de juarez #1992 Col. Villa bonita");
        p.setEstadoCivil("Soltero");
        p.setCorreoE("danya.fernandez@uabc.edu.mx");
        p.setPrepa("CBTIS No. 2013-2016");
        p.setUni("UABC 2016-2020");
        p.setCarrera("Licenciado en Sistemas Computacionales");
        model.addAttribute("hello", p);
        return "hello";
    }
}
