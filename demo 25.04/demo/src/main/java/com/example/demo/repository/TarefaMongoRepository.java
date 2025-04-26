package com.example.demo.repository;
import com.example.demo.model.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarefaMongoRepository extends MongoRepository<Tarefa, Long> {
}