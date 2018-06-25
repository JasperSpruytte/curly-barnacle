package be.jasperspruytte.zeticon.assignment.assignment;

import be.jasperspruytte.zeticon.assignment.assignment.mediahaven.MediaHavenProductService;
import be.jasperspruytte.zeticon.assignment.assignment.model.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping(value = "/sync", method = RequestMethod.POST)
    public String sync(RestTemplate restTemplate) {
        List<Product> products = new MediaHavenProductService(restTemplate).getAll();
        return "redirect:/";
    }
}
