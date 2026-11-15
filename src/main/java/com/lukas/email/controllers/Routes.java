package com.lukas.email.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Routes {

  @GetMapping({ "", "/" })
  public String getHome() {
    return "index";
  }

}
