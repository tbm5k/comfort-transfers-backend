package com.comforttransfers.comforttransfers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private MailService service;

    @CrossOrigin( origins = "http://localhost:8000")
    @PostMapping("/sendEmail")
    public ResponseEntity<Email> sendEmail(@RequestBody Email email){
        return ResponseEntity.ok().body(service.sendEmail(email));
    }
}
