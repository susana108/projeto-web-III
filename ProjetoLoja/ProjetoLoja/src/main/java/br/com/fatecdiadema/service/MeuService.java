package br.com.fatecdiadema.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  br.com.fatecdiadema.model.Cliente;
import  br.com.fatecdiadema.repository.MeuRepository;

@Service
public class MeuService {
    //Lógica e plano de negocio aqui

    private  MeuRepository repository;

    @Autowired
    public MeuService(MeuRepository repository){
        this.repository = repository;
    }


    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository = repository;
        
        //MeuRepository meuRepository = new MeuRepository();
       // meuRepository.persistir(cliente);

    }

    public void validarCliente(Cliente cliente){
        //aplica validação
    }
}