package id.ac.tazkia.hr.kompensasi.aplikasikompensasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class GajiPokokController {

    @GetMapping("/gaji_pokok/list")
    public void daftarGajiPokok(){

    }
    @GetMapping("/gaji_pokok/form")
    public void tampilkanForm(){

    }
}
