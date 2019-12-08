package com.jsfspring.curddemo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "REPTER")
public class RepterEntity {

    @Id
    @Column(name = "REPTERKOD", columnDefinition = "char")
    private String repterkod;

    @Column(name = "REPTERNEV")
    private String repternev;

    @Column(name = "HELYSZIN")
    private String helyszin;

    public String getRepterkod() {
        return repterkod;
    }

    public void setRepterkod(String repterkod) {
        this.repterkod = repterkod;
    }

    public String getRepternev() {
        return repternev;
    }

    public void setRepternev(String repternev) {
        this.repternev = repternev;
    }

    public String getHelyszin() {
        return helyszin;
    }

    public void setHelyszin(String helyszin) {
        this.helyszin = helyszin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepterEntity that = (RepterEntity) o;
        return Objects.equals(repterkod, that.repterkod) &&
                Objects.equals(repternev, that.repternev) &&
                Objects.equals(helyszin, that.helyszin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repterkod, repternev, helyszin);
    }
}
