package br.com.fatecdiadema;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

//@ComponentScan(
       // basePackages = {
             //   "br.com.fatecdiadema.repository",
              //  "br.com.fatecdiadema.service",
          //      "br.com.fatecdiadema.controller",
          //      "org.com.projetoqualquer"

       // }
//)

@RestController
public class VendasApplication{


    @Autowired
    @Qualifier("appName")
    private String appName;
@GetMapping("/")
    public  String index(){
        return "Página Principal da Loja";
    }

    public static void main(String[]args){
        SpringApplication.run(VendasApplication.class, args);
    }
}