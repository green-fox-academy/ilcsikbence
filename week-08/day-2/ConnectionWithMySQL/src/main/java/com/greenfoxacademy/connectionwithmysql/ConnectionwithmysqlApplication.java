package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication
//    implements CommandLineRunner
{

  TodoRepository todoRepository;

  public ConnectionwithmysqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectionwithmysqlApplication.class, args);
  }

//  @Override
//  public void run(String... args) throws Exception {
//    todoRepository.save(new Todo("This is a test todo line"));
//    todoRepository.save(new Todo("This is an urgent and done test todo line", true, true));
//    todoRepository.save(new Todo("This is an urgent test todo line", true, false));
//    todoRepository.save(new Todo("This is a done test todo line", false, true));
//  }
}
