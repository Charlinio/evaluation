package com.evaluation.controllers;

import com.evaluation.utils.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = UrlConstants.MOVIE)
public class MovieController {

    @GetMapping
    public String movies() {
        return "movies";
    }

}
