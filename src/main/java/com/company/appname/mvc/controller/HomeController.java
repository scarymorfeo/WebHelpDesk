package com.company.appname.mvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Clase que controla todas las peticiones relacionadas al Home
 * 
 * @author OMartinez (1.0.0)
 * @version 1.0.0, 03/08/2016
 */
@Controller
public class HomeController {
    static Logger log = Logger.getLogger("defaultLogger");    
    
     /**
     * Controller para enviar al home
     *  
     * @return regresa la cadena "home" la cual indica que se va a enviar a la pagina del home
     */
    @RequestMapping(value = "/home.htm",method = RequestMethod.GET)
    public String mostrarHome(){
        log.debug("Controller para redirigir al Home");
        return "home";
    }
    
}