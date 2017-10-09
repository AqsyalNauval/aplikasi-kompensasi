package id.ac.tazkia.hr.kompensasi.aplikasikompensasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartemenController {

    @GetMapping("/departemen/list")
    public void daftarDepartemen(){

    }

    @GetMapping("/departemen/form")
    public void tampilkanForm(){

    }
}
