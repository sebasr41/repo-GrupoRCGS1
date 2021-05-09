package ar.edu.unju.fi.tp4.service.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Compra;
import ar.edu.unju.fi.tp4.model.Producto;
import ar.edu.unju.fi.tp4.service.ICompraService;
import ar.edu.unju.fi.tp4.util.TablaProducto;

@Service
public class CompraServiceImp implements ICompraService{
	
	private static final Log LOGGER = LogFactory.getLog(CompraServiceImp.class);
	private List<Compra> compras;

	@Override
	public void generarTablaCompra() {
		// TODO Auto-generated method stub

		compras = TablaCompras.listaCompras;
		compras.add(new Compra(1,new Producto(5,"Samsung J5",10000,"Samsung",10 ),5,50000));

	}

	//agregar Compra
	@Override
	public void guardarCompra(Compra compra) {
		LOGGER.info("SERVICE: CompraServiceImp");
		LOGGER.info("Parametro: "+ compra);
		
		if(compras == null) {
			generarTablaCompra();
		}
		//Detecta si existe el producto segun el codigo ingresado
		for (int x = 0; x < TablaProducto.listaProductos.size(); x++) {
			Producto p = TablaProducto.listaProductos.get(x);
			if (p.getCodigo() == compra.getProducto().getCodigo()) {
				LOGGER.info("Service: Producto Encontrado");
                compra.setProducto(p);
				break; 
			}
		}
		double total=compra.getCantidad()*compra.getProducto().getPrecio();
		compra.setTotal(total);
		LOGGER.info("total: " + total);
		
		compras.add(compra);
		
		LOGGER.info("METHOD: guardarCompra - se agregó un objeto compra en la lista -> " + compras.get(compras.size()-1));

	}

	 
	 @Override
	public List<Compra> obtenerCompras() {
		LOGGER.info("SERVICE: CompraServiceImp");
		LOGGER.info("METHOD: obtenerCompras - se muestra la lista Compras -> "+ compras );
		return compras;
	}
	 


}