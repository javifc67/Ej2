package com.liceolapaz.des.JFC;

public class CuentaNormal extends CuentaBancaria {
	double saldoInicial;

	public CuentaNormal(double saldo) {
		this.saldoInicial = saldo;
	}

	@Override
	public void ingresar(double saldo) {
		this.saldoInicial += saldo;
	}

	@Override
	public void retirar(double saldo) {
		if (saldo >= saldoInicial) {
			System.out.println("Su saldo es de " + saldoInicial + " y no puedes quedarte en negativo.\rRetire una cantidad menor");
		} else {
			this.saldoInicial -= saldo;
			clear();
		}
	}

	private void clear() {
		System.out.println("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
		
	}

	@Override
	public double consultar() {

		return saldoInicial;
	}}
	
