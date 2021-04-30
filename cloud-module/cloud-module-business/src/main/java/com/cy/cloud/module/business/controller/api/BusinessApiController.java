package com.cy.cloud.module.business.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("business/api")
public class BusinessApiController {

    @RequestMapping("test")
    String test(){


        return "business来了";
    }
}
