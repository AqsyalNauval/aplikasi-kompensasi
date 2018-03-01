package id.ac.tazkia.hr.kompensasi.aplikasikompensasi.controller;

import id.ac.tazkia.hr.kompensasi.aplikasikompensasi.dao.DepartemenDao;
import id.ac.tazkia.hr.kompensasi.aplikasikompensasi.dao.JabatanStrukturalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JabatanStrukturalController {

    @Autowired
   private JabatanStrukturalDao jsd;

    @GetMapping("/jabatan_struktural/list")
    public ModelMap jabatanStruktural(@PageableDefault(size = 10) Pageable pageable, @RequestParam(name = "jabatan", required = false) String jabatan, Model model){
        if (jabatan != null) {
            model.addAttribute("key", jabatan);
            return new ModelMap().addAttribute("daftarJabatanStruktural", jsd.findByJabatanContainingIgnoreCaseOrderByJabatan(jabatan, pageable));
        } else {
            return new ModelMap().addAttribute("daftarJabatanStruktural", jsd.findAll(pageable));
        }
    }

    @GetMapping("/jabatan_struktural/form")
    public void formJabatanStruktural(){

    }
}
