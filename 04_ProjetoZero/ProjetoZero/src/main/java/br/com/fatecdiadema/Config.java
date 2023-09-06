package  br.com.fatecdiadema;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "configNome")
    public String configNome(){
        return "susu";
    }

    @Bean(name = "configIdade")
    public String configIdade(){
        return  "19";
    }
}