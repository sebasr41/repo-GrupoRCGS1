package ar.edu.unju.fi.tp4.service;

public interface ICompraService {

	public void generarTablaCompra();

	public void guardarCompra(Compra compra);

	public List<Compra> obtenerCompras();



}