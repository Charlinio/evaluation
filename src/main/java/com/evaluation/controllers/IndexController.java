package com.evaluation.controllers;

import com.evaluation.utils.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = UrlConstants.INDEX)
public class IndexController {

    @RequestMapping(path = "/")
    public String home() {
        return "index";
    }

}
