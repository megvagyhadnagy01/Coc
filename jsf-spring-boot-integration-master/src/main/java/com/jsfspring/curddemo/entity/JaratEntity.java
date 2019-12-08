package com.jsfspring.curddemo.entity;

import com.sun.crypto.provider.HmacPKCS12PBESHA1;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "JARAT")
@IdClass(JaratEntityPK.class)
public class JaratEntity {

    @Id
    @Column(name = "JARATSZAM")
    private String jaratszam;

    @Column(name = "LEGITARSASAG_KOD", columnDefinition = "char")
    private String legitarsasagKod;

    @Id
    @Column(name = "INDULASI_IDO")
    private Date indulasiIdo;

    @Column(name = "ERKEZESI_IDO")
    private Date erkezesiIdo;

    public String getJaratszam() {
        return jaratszam;
    }

    public void setJaratszam(String jaratszam) {
        this.jaratszam = jaratszam;
    }

    public String getLegitarsasagKod() {
        return legitarsasagKod;
    }

    public void setLegitarsasagKod(String legitarsasagKod) {
        this.legitarsasagKod = legitarsasagKod;
    }

    public Date getIndulasiIdo() {
        return indulasiIdo;
    }

    public void setIndulasiIdo(Date indulasiIdo) {
        this.indulasiIdo = indulasiIdo;
    }

    public Date getErkezesiIdo() {
        return erkezesiIdo;
    }

    public void setErkezesiIdo(Date erkezesiIdo) {
        this.erkezesiIdo = erkezesiIdo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JaratEntity that = (JaratEntity) o;
        return Objects.equals(jaratszam, that.jaratszam) &&
                Objects.equals(legitarsasagKod, that.legitarsasagKod) &&
                Objects.equals(indulasiIdo, that.indulasiIdo) &&
                Objects.equals(erkezesiIdo, that.erkezesiIdo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jaratszam, legitarsasagKod, indulasiIdo, erkezesiIdo);
    }
}
