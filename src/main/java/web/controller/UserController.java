package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import web.UserServise.UserService;
import web.model.UserModel;


import javax.validation.Valid;

@Controller
@RequestMapping("/people")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String ListUser(Model model) {
        model.addAttribute("people", userService.listUsers());
        return "ListUser";
    }

    @GetMapping("/{id}")
    public String showById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("person", userService.showUserById(id));
        return "showById";
    }

    @GetMapping("/createNew")
    public String newUser(@ModelAttribute("person") UserModel userModel) {
        return "newUser";
    }

    @PostMapping()
    public String createNewUser(@ModelAttribute("person") @Valid UserModel userModel,
                                BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "newUser";
        userService.add(userModel);
        return "redirect:/people";
    }

    @GetMapping("/{id}/update")
    public String ShowById(Model model, @PathVariable("id") Long id) {
        model.addAttribute("person", userService.showUserById(id));
        return "Update";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("person") @Valid UserModel userModel, BindingResult bindingResult,
                         @PathVariable("id") long id) {
        if (bindingResult.hasErrors())
            return "Update";
        userService.update(userModel);
        return "redirect:/people";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        userService.delete(id);
        return "redirect:/people";
    }
}