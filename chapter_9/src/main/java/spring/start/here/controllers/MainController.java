package spring.start.here.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.start.here.services.LoggedUserManagementService;
import spring.start.here.services.LoginCountService;

@Controller
public class MainController {

  private final LoggedUserManagementService loggedUserManagementService;
  private final LoginCountService loginCountService;

  public MainController(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
    this.loggedUserManagementService = loggedUserManagementService;
    this.loginCountService = loginCountService;
  }

  @GetMapping("/main")
  public String home(@RequestParam(required = false) String logout, Model model) {

    String username = loggedUserManagementService.getUsername();
    if (username == null) {
      return "redirect:/";
    }
    model.addAttribute("username", username);
    model.addAttribute("loginCount", loginCountService.getCount());
    return "main.html";
  }
}