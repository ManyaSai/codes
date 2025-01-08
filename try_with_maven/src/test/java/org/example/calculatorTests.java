package org.example;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class calculatorTests {

    private static final Logger log = LoggerFactory.getLogger(calculatorTests.class);
    calculator calci;
    @BeforeEach
    void setUp(){
        calci = new calculator();
        log.info("calculator obj created");
    }
    @AfterEach
    void tearDown(){
        calci = null;
        log.info("calculator obj destroyed");
    }

    @Test
    void add(){
//        calculator calci = new calculator();
        Assertions.assertEquals(90,calci.add(10,80));
    }
    @Test
    void divf(){
//        calculator calci = new calculator();
        Assertions.assertEquals(5,calci.divf(10,2));
//        Assertions.assertEquals(0,calci.div(10,0));
    }
    @Test
    void divi(){
     //   calculator calci = new calculator();
        Assertions.assertEquals(5,calci.divi(10,2));
//        Assertions.assertEquals(0,calci.div(10,0));
        Assertions.assertThrows(Exception.class,()->calci.divi(10,0));
    }
}
