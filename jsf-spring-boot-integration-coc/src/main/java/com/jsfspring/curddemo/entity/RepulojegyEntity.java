package com.jsfspring.curddemo.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "REPULOJEGY")
public class RepulojegyEntity {

    @Id
    @Column(name = "JEGY")
    private String jegy;

    @Column(name = "UTAZASI_OSZTALY")
    private String utazasiOsztaly;

    @Column(name = "DATUM")
    private Date datum;

    /*
    @OneToOne(mappedBy = "repulojegyEntity")
    private UtasEntity utasEntity;

     */

    public Long getUtasAzon() {
        return utasAzon;
    }

    public void setUtasAzon(Long utasAzon) {
        this.utasAzon = utasAzon;
    }

    private Long utasAzon;

    public String getJegy() {
        return jegy;
    }

    public void setJegy(String jegy) {
        this.jegy = jegy;
    }

    public String getUtazasiOsztaly() {
        return utazasiOsztaly;
    }

    public void setUtazasiOsztaly(String utazasiOsztaly) {
        this.utazasiOsztaly = utazasiOsztaly;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepulojegyEntity that = (RepulojegyEntity) o;
        return Objects.equals(jegy, that.jegy) &&
                Objects.equals(utazasiOsztaly, that.utazasiOsztaly) &&
                Objects.equals(datum, that.datum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jegy, utazasiOsztaly, datum);
    }
}
