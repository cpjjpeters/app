package com.amigoscode;

import com.amigoscode.services.SomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* carlpeters created on 15/06/2022 inside the package - PACKAGE_NAME */
@Slf4j
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        log.debug("This is the MAIN");
        System.out.println("Hello Amigo's");
        Person person = new Person("Jamila");
        log.info("Simple log statement with inputs {}, {} and {}", 1,2,3);
        log.info(person.getName());
        SomeService service = new SomeService();
        service.aThinghy();
    }
}
