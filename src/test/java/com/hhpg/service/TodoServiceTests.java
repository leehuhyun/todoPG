package com.hhpg.service;

import com.hhpg.todopg.dto.TodoDTO;
import com.hhpg.todopg.service.TodoService;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;

@Log4j2
public class TodoServiceTests {

    private TodoService todoService;

    @BeforeEach
    public void ready() {
        todoService = TodoService.INSTANCE;
    }

    @Test
    public void testRegister()throws Exception {

        TodoDTO todoDTO = TodoDTO.builder()
                .title("JDBC Test Title")
                .dueDate(LocalDate.now())
                .build();

        log.info("---------------------------------"); //log4j2
        log.info(todoDTO);

        todoService.register(todoDTO);
    }


//    @Test
//    public void testRegister()throws Exception {
//
//        TodoDTO todoDTO = TodoDTO.builder()
//                .title("JDBC Test Title")
//                .dueDate(LocalDate.now())
//                .build();
//
//        todoService.register(todoDTO);
//    }

}


