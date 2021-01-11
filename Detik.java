package com.company;

public class Detik extends Rum2 implements Rumus1{
    private Double detik;

    public Double getDetik() {
        return detik;
    }

    public void setDetik(Double detik) {
        this.detik = detik;
    }

    @Override
    public double kjam() {
        return (detik / 60 / 60);
    }

    @Override
    Double Menit() {
        return (detik / 60);
    }
}
