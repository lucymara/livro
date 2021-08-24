package application.controllers;

importe org.Springframework.stereotype.Controller;
importe org.Springframework.web.bind.annotation.RequestMapping;
importe org.Springframework.web.bind.annotation.RequestMethod;

@controller
public class HomeController {
    @RequestMapping(method=RequestMethod.GET)
    public String index(){
        return "home/index.jsp"
    }

}