package com.java.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        // Simulando um usuário válido (pode ser substituído por um banco de dados)
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        if (username.equals(usuarioCorreto) && password.equals(senhaCorreta)) {
            return "redirect:/home"; // Redireciona para a página home se o login for bem-sucedido
        } else {
            model.addAttribute("erro", "Usuário ou senha incorretos!");
            return "login"; // Retorna para a tela de login com erro
        }
    }

    @PostMapping("/home")
    public String home() {
        return "home"; // Página de boas-vindas (deve ser criada)
    }
}