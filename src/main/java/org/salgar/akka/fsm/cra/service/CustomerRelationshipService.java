package org.salgar.akka.fsm.cra.service;

import org.springframework.stereotype.Component;

@Component
public class CustomerRelationshipService {
    public String adapt() {
        System.out.println("adapt!");
        return "adapting";
    }
}