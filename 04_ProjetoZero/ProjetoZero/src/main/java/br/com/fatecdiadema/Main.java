package br.com.fatecdiadema;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main{

    @Autowired
    @Qualifier("configNome")
    private  String configNome;

    @Autowired
    @Qualifier("configIdade")
    private String configIdade;
    @GetMapping("/")
    public String index(){
        return "Pagina principal do Projeto";
    }

    // o getmapping é necessa´rio para eu conseguir localizar a rota
    @GetMapping("/nome")
    public  String nome(){
        return configNome;
    }

    @GetMapping("/idade")
    public  String idade(){
        return configIdade;
    }
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
        System.out.println("susu");
    }
}