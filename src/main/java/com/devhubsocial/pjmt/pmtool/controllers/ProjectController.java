package com.devhubsocial.pjmt.pmtool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/projects")
public class ProjectController {

    @RequestMapping("/new")
    public String displyProjectForm() {
        return "new-project";
    }
}
