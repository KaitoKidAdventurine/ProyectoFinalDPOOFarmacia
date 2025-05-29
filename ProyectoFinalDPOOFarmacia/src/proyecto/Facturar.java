package proyecto;

import java.sql.Date;

public interface Facturar 
{
	Factura generarFactura(String nombreDelMed, String codigoDelMed, int cantMedVendidos, Date fechaDeLaCompra);
	double calcularTotal();
}
