package edu.escuelaing.arsw.labs.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.escuelaing.arsw.labs.tdd.controllers.HomeController;

@SpringBootTest
class SmokeTest {

    @Autowired
    private HomeController controller;

    @Test
    void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}
