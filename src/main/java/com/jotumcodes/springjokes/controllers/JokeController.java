package com.jotumcodes.springjokes.controllers;

import com.jotumcodes.springjokes.services.JokeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Emmanuel Jonas on 27/05/2021
 */
@Controller
@AllArgsConstructor
public class JokeController {
    private final JokeService jokeService;

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
