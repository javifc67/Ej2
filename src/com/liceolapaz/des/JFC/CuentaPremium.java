package com.liceolapaz.des.JFC;

public class CuentaPremium extends CuentaBancaria {
	double saldo;

	public CuentaPremium(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void ingresar(double saldo) {
		this.saldo += saldo;
	}

	@Override
	public void retirar(double saldo) {
		this.saldo -= saldo;
	}

	@Override
	public double consultar() {

		return saldo;
	}

}
