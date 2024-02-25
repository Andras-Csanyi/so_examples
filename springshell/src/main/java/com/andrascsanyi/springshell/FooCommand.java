package com.andrascsanyi.springshell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.command.annotation.Command;

@Command(group = "a nice group name")
public class FooCommand {
    
    @Autowired
    BazComponent bazComponent;
    
    @Command(command = "foo", description = "Something meaningful")
    public void fooCommand() {
        System.out.println("foo command print");
    }
    
    @Command(command = "whatever", description = "whatever")
    public void whatever() {
        bazComponent.whatever();
    }
}
