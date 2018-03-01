package id.ac.tazkia.hr.kompensasi.aplikasikompensasi.dao;

import id.ac.tazkia.hr.kompensasi.aplikasikompensasi.entity.Departemen;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DepartemenDao extends PagingAndSortingRepository<Departemen, String>{
    public Page<Departemen> findByNamaContainingIgnoreCaseOrderByNama(String nama, Pageable Page);
}

