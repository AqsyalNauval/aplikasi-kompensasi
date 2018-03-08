package id.ac.tazkia.hr.kompensasi.aplikasikompensasi.controller;

import id.ac.tazkia.hr.kompensasi.aplikasikompensasi.dao.DepartemenDao;
import id.ac.tazkia.hr.kompensasi.aplikasikompensasi.dao.JabatanStrukturalDao;
import id.ac.tazkia.hr.kompensasi.aplikasikompensasi.entity.Departemen;
import id.ac.tazkia.hr.kompensasi.aplikasikompensasi.entity.JabatanStruktural;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;

@Controller
public class JabatanStrukturalController {

    @Autowired
   private JabatanStrukturalDao jd;

    @GetMapping("/jabatanstruktural/list")
    public ModelMap jabatanStruktural(@PageableDefault(size = 10) Pageable pageable, @RequestParam(name = "jabatan", required = false) String jabatan, Model model){
        if (jabatan != null) {
            model.addAttribute("key", jabatan);
            return new ModelMap().addAttribute("daftarJabatanStruktural", jd.findByJabatanContainingIgnoreCaseOrderByJabatan(jabatan, pageable));
        } else {
            return new ModelMap().addAttribute("daftarJabatanStruktural", jd.findAll(pageable));
        }
    }

    @RequestMapping(value = "/jabatanstruktural/form", method = RequestMethod.GET)
    public String tampilkanForm(@RequestParam(value = "id", required = false) String id,
                                Model m){
        //defaultnya, isi dengan object baru
        m.addAttribute("jabatanStruktural", new JabatanStruktural());


        if (id != null && !id.isEmpty()){
            JabatanStruktural p= jd.findOne(id);
            if (p != null){
                m.addAttribute("jabatanStruktural", p);

            }
        }
        return "/jabatanstruktural/form";
    }

    @RequestMapping(value = "/jabatanstruktural/form", method = RequestMethod.POST)
    public String prosesForm(@ModelAttribute @Valid JabatanStruktural p, BindingResult errors){
        if(errors.hasErrors()){
            return "/jabatanstruktural/form";
        }

        p.setStatus("A");
        jd.save(p);
        return "redirect:list";
    }

}
