package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
public class CarsController {

    CarsService Serv = new CarsService();

    @GetMapping (value = "/cars")
    public String tableCars (@RequestParam(value = "count", required = false) String count, Model model){
        System.out.println(Serv.printAllCars().toString());
        model.addAttribute("cars", Serv.getCars(count));
        return "/cars";
    }
}