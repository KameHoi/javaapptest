package com.javaapptest.javaapptest.Controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
@WebMvcTest(DemoController.class)
public class DemoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private DemoController demoController;

    @BeforeEach
    public void setUp() {
        // Configurer le comportement attendu du mock DemoController
        Mockito.when(demoController.demo())
                .thenReturn(ResponseEntity.ok("Hello demo"));
    }

    @Test
    public void testDemo() throws Exception {
        // Effectuer une requête GET sur /demo et vérifier le statut de réponse
        mockMvc.perform(get("/demo"))
                .andExpect(status().isOk());
    }
}