package com.github.mangila.springbootrestfulservice.web.resource.v1;

import com.github.mangila.springbootrestfulservice.web.service.v1.CustomerService;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@Tag("resources")
@WebMvcTest(CustomerResource.class)
class CustomerResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CustomerService service;

    @Test
    void findAll() {
        //TODO impl
    }

    @Test
    void findById() {
        //TODO impl
    }

    @Test
    void insertNewCustomer() {
        //TODO impl
    }

    @Test
    void updateCustomer() {
        //TODO impl
    }

    @Test
    void deleteById() {
        //TODO impl
    }
}