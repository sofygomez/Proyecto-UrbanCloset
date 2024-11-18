
package com.urbancloset.controller;

import com.urbancloset.service.UrbanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/Urban")

public class UrbanController {
 
    @Autowired
    private UrbanService UrbanService;

    @GetMapping("/listado")
    public String listarRopa(Model model) {
        var ropa = UrbanService.getropa(false);
        model.addAttribute("ropa", ropa);
        model.addAttribute("totalRopa", ropa.size());
        return "ropa/listado";
    }
    
}
