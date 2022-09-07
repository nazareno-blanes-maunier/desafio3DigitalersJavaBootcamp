package Desafio1;

import java.util.Date;

public class Cuenta extends Cliente {
    
    public Date fechaDeApertura;
    public String numero;
    public double saldo;
    public double interes;
    public int meses;
    
    public Date getFechaDeApertura() {
        return fechaDeApertura;
    }
    public void setFechaDeApertura(Date fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getInteres() {
        return interes;
    }
    public void setInteres(double interes) {
        this.interes = interes;
    }
    public int getMeses() {
        return meses;
    }
    public void setMeses(int meses) {
        this.meses = meses;
    }

     
    
    }
