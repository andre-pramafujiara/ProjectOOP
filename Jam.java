package com.company;

public class Jam extends Rum3 implements Rumus2{
    private Double jam;

    public Double getJam() {
        return jam;
    }

    public void setJam(Double jam) {
        this.jam = jam;
    }

    @Override
    public double kmnt() {
        return (jam * 60);
    }

    @Override
    Double Detik() {
        return (jam * 60 * 60);
    }
}
