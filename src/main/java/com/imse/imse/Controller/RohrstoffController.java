package com.imse.imse.Controller;

import com.imse.imse.Service.RohrstoffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RohrstoffController {

    @Autowired
    RohrstoffService rohrstoffService;


}