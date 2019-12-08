package com.jsfspring.curddemo.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "FOGLALAS")
@IdClass(FoglalasEntityPK.class)
public class FoglalasEntity {

    @Id
    @Column(name = "JEGY")
    private String jegy;

    @Id
    @Column(name = "JARATSZAM")
    private String jaratszam;

    @Id
    @Column(name = "INDULASI_IDO")
    private Date indulasiIdo;

    public String getJegy() {
        return jegy;
    }

    public void setJegy(String jegy) {
        this.jegy = jegy;
    }

    public String getJaratszam() {
        return jaratszam;
    }

    public void setJaratszam(String jaratszam) {
        this.jaratszam = jaratszam;
    }

    public Date getIndulasiIdo() {
        return indulasiIdo;
    }

    public void setIndulasiIdo(Date indulasiIdo) {
        this.indulasiIdo = indulasiIdo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoglalasEntity that = (FoglalasEntity) o;
        return Objects.equals(jegy, that.jegy) &&
                Objects.equals(jaratszam, that.jaratszam) &&
                Objects.equals(indulasiIdo, that.indulasiIdo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jegy, jaratszam, indulasiIdo);
    }
}
