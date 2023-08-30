package br.com.fatecdiadema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@RequestMapping("/")

public  class VendaApp {

    @GetMapping("/")
    public String index(){
        return "Página index";
    }

    @GetMapping("/rota1/{nome}")
    public String rota1(@PathVariable String nome, ModelMap model){

        model.addAttribute("nome", nome);

        return "rota1";
    }
    @GetMapping("/rota2")
    public String rota2(){
        return "Página da rota 2";
    }

    public static  void main(String[] args){
        SpringApplication.run(VendaApp.class,args);

        System.out.println("Vendas Apps");
    }
}