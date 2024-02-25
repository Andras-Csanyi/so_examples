package com.andrascsanyi.springshell;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.shell.test.ShellTestClient;
import org.springframework.shell.test.autoconfigure.ShellTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;

@ShellTest
@ComponentScan(basePackages = "com.andrascsanyi.springshell")
@DirtiesContext(methodMode = DirtiesContext.MethodMode.BEFORE_METHOD)
public class CommandTests {
    
    @Autowired
    ShellTestClient shellTestClient;
    
    @Test
    public void test() {
        
        ShellTestClient.NonInteractiveShellSession session = shellTestClient
            .nonInterative("whatever")
            .run();
        
        await().atMost(2, TimeUnit.SECONDS).untilAsserted(() -> {
            
            session.screen().lines().forEach(System.out::println);
            
        });
        
    }
}
