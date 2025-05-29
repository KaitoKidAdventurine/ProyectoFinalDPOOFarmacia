package proyecto;

import java.awt.List;
import java.sql.Date;
import java.util.ArrayList;

public class Farmacia implements Facturar, Reportes
{
	private ArrayList<Factura> facturas;
	private ArrayList<Medicamento> medicamentos;
	
	@Override
	public Factura generarFactura(String nombreDelMed, String codigoDelMed, int cantMedVendidos, Date fechaDeLaCompra) 
	{
		Factura facturacion = new Factura(nombreDelMed, codigoDelMed, cantMedVendidos, fechaDeLaCompra);
		return facturacion;
	}
	
	@Override
	public double calcularTotal() {
		
		return 0;
	}
	
	@Override 
	public ArrayList<VentaDeMedicamentos> medicamentosMasVendidos()
	{
		ArrayList<VentaDeMedicamentos> medMasVendidos = buscarOrdenDeAccion();
		return medMasVendidos;
	}
	
	public ArrayList<VentaDeMedicamentos> buscarOrdenDeAccion()
	{
		
		ArrayList<String> nombres = new ArrayList<>();
		ArrayList<Integer> cantidad = new ArrayList<>();
		for(Medicamento m: medicamentos)
		{
			int totalVendidoDelMedicamento = 0;
			for(Factura f: facturas)
				if(m.nomComun.equals(f.getNombreDelMed()))
					totalVendidoDelMedicamento += f.getCantMedVendidos();
				
			if(totalVendidoDelMedicamento > 0)
			{
				nombres.add(m.nomComun);
				cantidad.add(totalVendidoDelMedicamento);
			}
		}
		ArrayList<VentaDeMedicamentos> ventas =transformarYOrdenar(nombres, cantidad);
		return ventas;
	}
	
	public ArrayList<VentaDeMedicamentos> transformarYOrdenar(ArrayList<String> nombres, ArrayList<Integer> cantidad) 
	{
		ArrayList<VentaDeMedicamentos> ventasOrdenadas = new ArrayList<>();
		
		for(int i = 0; i< nombres.size(); i++)
		{
			for(int j = 0; j < nombres.size() -1 ; j++)
			{
				if(cantidad.get(j) < cantidad.get(j+1) )
				{
					int temp = cantidad.get(j);
					cantidad.set(j, cantidad.get(j+1));
					cantidad.set(j+1, temp);
					
					String temporal = nombres.get(j);
					nombres.set(j, nombres.get(j+1));
					nombres.set(j+1, temporal);
				}
			}
		}
		
		for(int i = 0; i< nombres.size(); i++)
		{
			VentaDeMedicamentos ventas = new VentaDeMedicamentos();
			ventas.setCantidadVendida(cantidad.get(i));
			ventas.setNombre(nombres.get(i));
			ventasOrdenadas.add(ventas);
		}
		
		return ventasOrdenadas;
	}
	
	

	public ArrayList<Factura> getFacturas() 
	{
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) 
	{
		this.facturas = facturas;
	}

	public ArrayList<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
}
