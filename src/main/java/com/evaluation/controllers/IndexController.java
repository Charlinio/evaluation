package com.evaluation.controllers;

import com.evaluation.utils.FileWR;
import com.evaluation.utils.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Controller
@RequestMapping(path = UrlConstants.INDEX)
public class IndexController {

    @RequestMapping(path = "/")
    public String home() {
        List<Runnable> threads = new ArrayList<>();
        threads.add(new FileWR());
        threads.add(new FileWR());
        threads.add(new FileWR());
        threads.add(new FileWR());
        threads.add(new FileWR());
        ExecutorService executorService = Executors.newScheduledThreadPool(5);
        threads.forEach(executorService::execute);
        return "index";
    }

}
