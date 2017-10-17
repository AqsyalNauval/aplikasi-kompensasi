package id.ac.tazkia.hr.kompensasi.aplikasikompensasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PengajuanCutiController {

    @GetMapping("/cuti/form")
    public void tampilkanForm(){}

}
