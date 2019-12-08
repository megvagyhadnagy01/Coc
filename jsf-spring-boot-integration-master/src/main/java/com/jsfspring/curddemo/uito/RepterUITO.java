package com.jsfspring.curddemo.uito;

import java.util.Objects;

public class RepterUITO {
    private String repterkod;
    private String repternev;
    private String helyszin;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepterUITO that = (RepterUITO) o;
        return Objects.equals(repterkod, that.repterkod) &&
                Objects.equals(repternev, that.repternev) &&
                Objects.equals(helyszin, that.helyszin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repterkod, repternev, helyszin);
    }

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
}
