package ThymleafWebController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping({"/","index"})
    public String getIndex(Model model){
        model.addAttribute("name","Jose" );
        return "index";
    }
}
