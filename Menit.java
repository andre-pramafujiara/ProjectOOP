package com.company;

public class Menit extends Rum1 implements Rumus3{
    private Double menit;

    public Double getMenit() {
        return menit;
    }

    public void setMenit(Double menit) {
        this.menit = menit;
    }

    @Override
    Double Jam() {
        return (menit / 60);
    }

    @Override
    public double kdtk() {
        return (menit * 60);
    }
}
