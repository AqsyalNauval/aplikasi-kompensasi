package id.ac.tazkia.hr.kompensasi.aplikasikompensasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataKaryawanController {

    @GetMapping("/data_karyawan/list")
    public void dataKaryawan(){

    }

    @GetMapping("/data_karyawan/form")
    public void karyawanForm(){

    }


}
