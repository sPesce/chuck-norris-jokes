package spesce.springframework.chucknorrisjokes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spesce.springframework.chucknorrisjokes.services.JokeService;

/**
 * Created By Steve P. on 12/21/2020
 * original package: spesce.springframework.chucknorrisjokes.controllers
 * ------------------------------------------------------------------------------------------
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model) {

        model.addAttribute("joke",jokeService.getJoke());
        return "chucknorris";
    }
}
