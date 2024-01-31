package org.example.include_sources_directory.controller;

import com.andrascsanyi.example.graphql.Something;
import org.springframework.graphql.data.method.annotation.QueryMapping;

@org.springframework.stereotype.Controller
public class Controller {
    
    @QueryMapping(name = "something")
    public Something somthing() {
        return null;
    }
}
