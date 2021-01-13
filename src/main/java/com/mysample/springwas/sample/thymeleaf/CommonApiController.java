package com.mysample.springwas.sample.thymeleaf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/thymeleaf/api")
public class CommonApiController {

    private static final Logger logger = LoggerFactory.getLogger(CommonApiController.class);

}