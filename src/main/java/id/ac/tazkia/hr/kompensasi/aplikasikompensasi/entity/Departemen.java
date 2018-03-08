package id.ac.tazkia.hr.kompensasi.aplikasikompensasi.entity;


import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Data
@Table(name="sdm_departemen")
public class Departemen {

    @Id @Column(name = "id_departemen")
    @GeneratedValue(generator = "uuid" )
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false)
    @NotNull
    @NotEmpty
    private String nama;

    @Column(nullable = false)
    @NotEmpty
    private String  keterangan;

    @Column(nullable = false)
    private String status;

}
