package com.amigoscode.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/* carlpeters created on 15/06/2022 inside the package - com.amigoscode */
@Slf4j
@Component
@org.springframework.stereotype.Service
public class SomeService {


    public void aThinghy(){
        String namel = "BOZO";
        log.debug("This is NOT the MAIN {}", namel);

    }

}
