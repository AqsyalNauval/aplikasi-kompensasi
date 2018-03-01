package id.ac.tazkia.hr.kompensasi.aplikasikompensasi.controller;

import id.ac.tazkia.hr.kompensasi.aplikasikompensasi.dao.DepartemenDao;
import id.ac.tazkia.hr.kompensasi.aplikasikompensasi.entity.Departemen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller

public class DepartemenController {


    @Autowired
    private DepartemenDao dd;

    @GetMapping("/departemen/list")
    public ModelMap departemen(@PageableDefault(size = 10) Pageable pageable, @RequestParam(name = "nama", required = false) String nama, Model model){
        if (nama != null) {
            model.addAttribute("key", nama);
            return new ModelMap().addAttribute("daftarDepartemen", dd.findByNamaContainingIgnoreCaseOrderByNama(nama, pageable));
        } else {
            return new ModelMap().addAttribute("daftarDepartemen", dd.findAll(pageable));
        }
    }


    @RequestMapping(value = "/departemen/form", method = RequestMethod.GET)
    public String tampilkanForm(@RequestParam(value = "id", required = false) String id,
                                Model m){
        //defaultnya, isi dengan object baru
        m.addAttribute("departemen", new Departemen());


        if (id != null && !id.isEmpty()){
            Departemen p= dd.findOne(id);
            if (p != null){
                m.addAttribute("departemen", p);

            }
        }
        return "/departemen/form";
    }


    @RequestMapping(value = "/departemen/form", method = RequestMethod.POST)
    public String prosesForm(@ModelAttribute @Valid Departemen p, BindingResult errors){
        if(errors.hasErrors()){
            return "/departemen/form";
        }

        p.setStatus("A");
        dd.save(p);
        return "redirect:list";
    }

}
