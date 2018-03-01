package id.ac.tazkia.hr.kompensasi.aplikasikompensasi.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name="sdm_jabatan")
public class JabatanStruktural {

    @Id @Column(name = "id_jabatan")
    @GeneratedValue(generator = "uuid" )
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String jabatan;

    private String keterangan;

    private String status;

}
