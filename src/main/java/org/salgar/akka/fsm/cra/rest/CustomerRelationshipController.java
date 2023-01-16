package org.salgar.akka.fsm.cra.rest;

import lombok.RequiredArgsConstructor;
import org.salgar.akka.fsm.cra.service.CustomerRelationshipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerRelationshipController {
    private final CustomerRelationshipService customerRelationshipService;

    @GetMapping("/adapting")
    public String adapting() {
        return customerRelationshipService.adapt();
    }
}