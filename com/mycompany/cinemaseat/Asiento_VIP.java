package com.mycompany.cinemaseat;

class Asiento_VIP implements TipoAsiento {
    private double espacioExtra;
    private String comodidad;

    public Asiento_VIP(double espacioExtra, String comodidad) {
        this.espacioExtra = espacioExtra;
        this.comodidad = comodidad;
    }

    @Override
    public double calcularPrecio() {
        return 20.0; 
    }
}
