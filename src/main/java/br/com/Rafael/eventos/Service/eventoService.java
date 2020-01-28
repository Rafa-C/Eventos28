package br.com.Rafael.eventos.Service;

import br.com.Rafael.eventos.Models.eventosModel;
import br.com.Rafael.eventos.repository.eventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class eventoService {

    @Autowired
    private eventosRepository repository;

    public eventosModel cadastraEventos(eventosModel eventos) {
        return repository.save(eventos);
    }


}
