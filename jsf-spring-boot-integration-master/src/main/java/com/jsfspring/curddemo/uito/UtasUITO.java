package com.jsfspring.curddemo.uito;

import java.util.Objects;

public class UtasUITO {
    private long utasAzon;
    private String vnev;
    private String knev;
    private String telefon;
    private String email;
    private String lakcim;

    public long getUtasAzon() {
        return utasAzon;
    }

    public void setUtasAzon(long utasAzon) {
        this.utasAzon = utasAzon;
    }

    public String getVnev() {
        return vnev;
    }

    public void setVnev(String vnev) {
        this.vnev = vnev;
    }

    public String getKnev() {
        return knev;
    }

    public void setKnev(String knev) {
        this.knev = knev;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLakcim() {
        return lakcim;
    }

    public void setLakcim(String lakcim) {
        this.lakcim = lakcim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UtasUITO that = (UtasUITO) o;
        return utasAzon == that.utasAzon &&
                Objects.equals(vnev, that.vnev) &&
                Objects.equals(knev, that.knev) &&
                Objects.equals(telefon, that.telefon) &&
                Objects.equals(email, that.email) &&
                Objects.equals(lakcim, that.lakcim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utasAzon, vnev, knev, telefon, email, lakcim);
    }
}
