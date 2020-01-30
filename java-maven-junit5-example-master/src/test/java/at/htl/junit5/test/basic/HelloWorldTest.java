package at.htl.junit5.test.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    private HelloWorld helloWorld;
    @BeforeEach
    @DisplayName("Before run test case to init resource")
    void init() {
        helloWorld = new HelloWorld();
    }

    @Test
    @DisplayName("Run test case.")
    void sayHelloWorld() {
        assertEquals("Hello World", helloWorld.sayHelloWorld());
    }

    @AfterEach
    @DisplayName("Finish Test to destroy resource")
    void tearDown() {
        helloWorld = null;
    }

}