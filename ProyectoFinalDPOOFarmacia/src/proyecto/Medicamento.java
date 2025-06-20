package proyecto;

import java.sql.Date;

public class Medicamento 
{
	protected String nomComun;
	protected String nomCientifico;
	protected String presentacion ;
	protected double precio;
	protected String tipo;
	protected String fortalezaDelMed; 
	protected double tempDeAlmac;
	protected long  cantExis;
	protected Date fechaDeProd;
	protected Date fechaDeVenc;

	public String getNomComun() 
	{
		return nomComun;
	}

	public String getNomCientifico() 
	{
		return nomCientifico;
	}

	public String getPresentacion() 
	{
		return presentacion;
	}

	public String getTipo() 
	{
		return tipo;
	}

	public String getFortalezaDelMed() 
	{
		return fortalezaDelMed;
	}

	public double getTempDeAlmac() 
	{
		return tempDeAlmac;
	}

	public long getCantExis() 
	{
		return cantExis;
	}

	public Date getFechaDeProd() 
	{
		return fechaDeProd;
	}

	public Date getFechaDeVenc() 
	{
		return fechaDeVenc;
	}

	public Medicamento(String nomComun, String nomCientifico, String presentacion, double precio, String tipo, String fortalezaDelMed, double tempDeAlmac, long cantExis, Date fechaDeProd, Date fechaDeVenc) 
	{
		setNomComun(nomComun);
		setNomCientifico(nomCientifico);
		setPresentacion(presentacion);
		setPrecio(precio);
		setTipo(tipo);
		setFortalezaDelMed(fortalezaDelMed);
		setTempDeAlmac(tempDeAlmac);
		setCantExis(cantExis);
		setFechaDeProd(fechaDeProd);
		setFechaDeVenc(fechaDeVenc);
	}



	public void setNomComun(String nomComun) 
	{
		if(Validaciones.noEstaVacio(nomComun))
			if(Validaciones.noTieneNumeros(nomComun))
				if(Validaciones.noTieneCaracteresEsp(nomComun))
					this.nomComun = nomComun;
				else
					throw new IllegalArgumentException("El campo: nombre comun del medicamento, presenta caracteres especiales");
			else
				throw new IllegalArgumentException("El campo: nombre comun del medicamento, presenta n�meros");
		else
			throw new IllegalArgumentException("El campo: nombre comun del medicamento, se encuentra vac�o");
	}

	public void setNomCientifico(String nomCientifico) 
	{
		if(Validaciones.noEstaVacio(nomCientifico))
			if(Validaciones.noTieneCaracteresEsp(nomCientifico))
				if(Validaciones.noTieneNumeros(nomCientifico))
					this.nomCientifico = nomCientifico;
				else
					throw new IllegalArgumentException("El campo: nombre cient�fico del medicamento, presenta caracteres especiales");
			else
				throw new IllegalArgumentException("El campo: nombre cient�fico del medicamento, presenta n�meros");
		else
			throw new IllegalArgumentException("El campo: nombre cient�fico del medicamento, se encuentra vac�o");
	}


	public void setPresentacion(String presentacion) 
	{
		if(Validaciones.noEstaVacio(presentacion))
			if(Validaciones.noTieneCaracteresEsp(presentacion))
				if(Validaciones.noTieneNumeros(presentacion))
					this.presentacion = presentacion;
				else
					throw new IllegalArgumentException("El campo: presentaci�n del medicamento, presenta caracteres especiales");
			else
				throw new IllegalArgumentException("El campo: presentaci�n del medicamento, presenta n�meros");
		else
			throw new IllegalArgumentException("El campo: presentaci�n del medicamento, se encuentra vac�o");
	}

	public void setPrecio(double precio) 
	{
		if(Validaciones.noEstaVacio(precio))
			if(!Validaciones.esUnaLetra(precio))
				if(Validaciones.noTieneCaracteresEsp(precio))
					this.precio = precio;
				else
					throw new IllegalArgumentException("El campo: precio del medicamento, presenta caracteres especiales");
			else
				throw new IllegalArgumentException("El campo: precio del medicamento, presenta letras");
		else
			throw new IllegalArgumentException("El campo: precio del medicamento, se encuentra vac�o");
	}


	public void setTipo(String tipo) 
	{
		if(Validaciones.noEstaVacio(tipo))
			if(Validaciones.noTieneCaracteresEsp(tipo))
				if(Validaciones.noTieneNumeros(tipo))
					this.tipo = tipo;
				else
					throw new IllegalArgumentException("El campo: tipo de medicamento, presenta caracteres especiales");
			else
				throw new IllegalArgumentException("El campo: tipo de medicamento, presenta n�meros");
		else
			throw new IllegalArgumentException("El campo: tipo de medicamento, se encuentra vac�o");


	}

	public void setFortalezaDelMed(String fortalezaDelMed) 
	{
		if(Validaciones.noEstaVacio(fortalezaDelMed))
			if(Validaciones.noTieneCaracteresEsp(fortalezaDelMed))
				if(Validaciones.noTieneNumeros(fortalezaDelMed))
					this.fortalezaDelMed = fortalezaDelMed;
				else
					throw new IllegalArgumentException("El campo: fortaleza de medicamento, presenta caracteres especiales");
			else
				throw new IllegalArgumentException("El campo: tipo de medicamento, presenta n�meros");
		else
			throw new IllegalArgumentException("El campo: tipo de medicamento, se encuentra vac�o");


	}

	public void setTempDeAlmac(double tempDeAlmac) 
	{
		if(Validaciones.noEstaVacio(tempDeAlmac))
			if(Validaciones.noTieneCaracteresEsp(tempDeAlmac))
				if(Validaciones.tieneNumeros(tempDeAlmac))
					this.tempDeAlmac = tempDeAlmac;
				else
					throw new IllegalArgumentException("El campo: temperatura de almacenamiento del medicamento, presenta letras");
			else
				throw new IllegalArgumentException("El campo: temperatura de almacenamiento del medicamento, presenta caracteres especiales");

		else
			throw new IllegalArgumentException("El campo: temperatura de almacenamiento del medicamento, se encuentra vac�o");

	}

	public void setCantExis(long cantExis) 
	{
		if(Validaciones.noEstaVacio(cantExis))
			if(Validaciones.noTieneCaracteresEsp(cantExis))
				if(Validaciones.tieneNumeros(cantExis))
					this.cantExis = cantExis;
				else
					throw new IllegalArgumentException("El campo: cantidad de medicamentos existentes, presenta letras");
			else
				throw new IllegalArgumentException("El campo: cantidad de medicamentos existentes, presenta caracteres especiales");

		else
			throw new IllegalArgumentException("El campo: cantidad de medicamentos existentes, se encuentra vac�o");
	}

	public void setFechaDeProd(Date fechaDeProd) 
	{
		this.fechaDeProd = fechaDeProd;
	}


	public void setFechaDeVenc(Date fechaDeVenc) 
	{
		this.fechaDeVenc = fechaDeVenc;
	}



}
