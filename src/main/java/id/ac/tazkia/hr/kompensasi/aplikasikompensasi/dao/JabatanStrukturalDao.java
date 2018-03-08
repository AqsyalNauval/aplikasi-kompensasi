package id.ac.tazkia.hr.kompensasi.aplikasikompensasi.dao;

import id.ac.tazkia.hr.kompensasi.aplikasikompensasi.entity.JabatanStruktural;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JabatanStrukturalDao extends PagingAndSortingRepository<JabatanStruktural, String> {
    public Page<JabatanStruktural> findByJabatanContainingIgnoreCaseOrderByJabatan(String jabatan, Pageable Page);
}
