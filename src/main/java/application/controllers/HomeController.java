package application.controllers;

import org.Springframework.stereotype.Controller;
import org.Springframework.web.bind.annotation.RequestMapping;
import org.Springframework.web.bind.annotation.RequestMethod;

@controller
public class HomeController {
    @RequestMapping(method=RequestMethod.GET)
    public String index(){
        return "home/index.jsp"
    }

}