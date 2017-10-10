package id.ac.tazkia.hr.kompensasi.aplikasikompensasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KomponenGajiController {

    @GetMapping("/komponen_gaji/list")
    public void daftarKomponenGaji(){

    }

    @GetMapping("/komponen_gaji/form")
    public void  formKomponenGaji(){

    }

}
