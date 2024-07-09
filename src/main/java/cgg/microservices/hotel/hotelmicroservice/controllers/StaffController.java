package cgg.microservices.hotel.hotelmicroservice.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/staffs")
@Tag(name = "Staff Controller", description = "This is Staff Servcie Apis")
public class StaffController {

    @GetMapping
    public ResponseEntity<List<String>> getAllStaffs() {

        List<String> list = List.of("abc", "xyz", "lmn", "pqr");
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }
}
