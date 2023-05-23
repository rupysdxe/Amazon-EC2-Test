package com.example.amazonec2test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

       @GetMapping("/test")
        public ResponseEntity<String> hello() {
            return ResponseEntity.ok("Every Thing is working fine");
        }
}
