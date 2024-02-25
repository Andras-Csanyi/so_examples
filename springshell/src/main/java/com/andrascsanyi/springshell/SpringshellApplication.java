package com.andrascsanyi.springshell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.CommandScan;
import org.springframework.shell.command.annotation.EnableCommand;

@EnableCommand(FooCommand.class)
@SpringBootApplication
public class SpringshellApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringshellApplication.class, args);
    }
    
}
