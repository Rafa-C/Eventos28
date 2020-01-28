package br.com.Rafael.eventos.repository;

import br.com.Rafael.eventos.Models.eventosModel;
import org.springframework.data.repository.CrudRepository;

public interface eventosRepository extends CrudRepository<eventosModel, String> {
}
