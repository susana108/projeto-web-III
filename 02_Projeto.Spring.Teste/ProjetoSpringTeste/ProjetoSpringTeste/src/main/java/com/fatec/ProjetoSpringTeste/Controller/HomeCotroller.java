package  com.fatec.ProjetoSpringTeste.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class HomeCotroller {

    @GetMapping("/saudacao/{nome}")
    public String saudacao(@PathVariable String nome, ModelMap model){


        model.addAttribute( "nome", nome);

        return  "saudacao";
    }

    @GetMapping("/calculo/{valor1}/{valor2}")
    public String calculo(@PathVariable double valor1, @PathVariable double valor2){

        double soma = valor1 + valor2;

         return "soma";
    }
}