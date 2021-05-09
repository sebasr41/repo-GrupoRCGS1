package ar.edu.unju.fi.tp4.service.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Producto;
import ar.edu.unju.fi.tp4.service.IProductoService;
import ar.edu.unju.fi.tp4.util.TablaProducto;

@Service
public class ProductoServiceImp implements IProductoService {

	private List<Producto> productos; 

    private static final Log LOGGER = LogFactory.getLog(ProductoServiceImp.class);

    @Override
    public void addProducto(Producto producto) {
        TablaProducto.listaProductos.add(producto);
        LOGGER.info("SERVICE: IProductoService -> ProductoServiceImp");
        LOGGER.info("METHOD: addProducto - se agregó un objeto producto en la lista -> "+TablaProducto.listaProductos.get(TablaProducto.listaProductos.size()-1));
        LOGGER.info("RESULT: a object producto");
    }
    
    @Override
    public List<Producto> showLastProducto() {
    	
    	LOGGER.info("SERVICE: IProductoService -> ProductoServiceImp");
		LOGGER.info("METHOD showLastProducto : muestra la LISTA PRODUCTOS "+ TablaProducto.listaProductos);
		
        return productos;
    }

	@Override
	public void generarTablaLProducto() {
		// TODO Auto-generated method stub
		productos = TablaProducto.listaProductos;
		LOGGER.info("SERVICE: IProductoService -> ProductoServiceImp");
		LOGGER.info("METHOD generarTablaProducto() : genera la tabla producto ");
		
	}

    

}