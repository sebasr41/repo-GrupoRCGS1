package ar.edu.unju.fi.tp4.service.imp;

import java.util.List;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.service.ICompraService;

@Service
public class CompraServiceImp implements ICompraService{


	//private List<Compra> compras;

	@Override
	public void generarTablaCompra() {
		// TODO Auto-generated method stub

		//compras = TablaCompras.listaCompras;
		//compras.add(new Compra(1,"Limon",1000,2000));

	}

	//agregar Compra
	@Override
	public void guardarCompra() {
		// TODO Auto-generated method stub
		/*
		if(compras == null) {
			generarTablaLCompra();
		}
		compras.add(compra);
		*/
	}

	/*
	 
	 @Override
	public List<Compra> obtenerCompras() {
		return compras;
	}
	 
	 */


}