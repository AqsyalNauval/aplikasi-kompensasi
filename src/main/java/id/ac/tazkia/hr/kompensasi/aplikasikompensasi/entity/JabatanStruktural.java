package id.ac.tazkia.hr.kompensasi.aplikasikompensasi.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.awt.font.NumericShaper;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Data
@Table(name="sdm_jabatan")
public class JabatanStruktural {

    @Id @Column(name = "id_jabatan")
    @GeneratedValue(generator = "uuid" )
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false)
    @NotNull
    @NotEmpty
    private String jabatan;

    @Column(nullable = false)
    private String keterangan;

    private BigDecimal nilai;

    @Column(nullable = false)
    private String status;

}
