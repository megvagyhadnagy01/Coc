
package com.jsfspring.curddemo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class JaratEntityPK implements Serializable {

    @Column(name = "JARATSZAM")
    @Id
    private String jaratszam;

    @Column(name = "INDULASI_IDO")
    @Id
    private Date indulasiIdo;

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
        JaratEntityPK that = (JaratEntityPK) o;
        return Objects.equals(jaratszam, that.jaratszam) &&
                Objects.equals(indulasiIdo, that.indulasiIdo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jaratszam, indulasiIdo);
    }
}