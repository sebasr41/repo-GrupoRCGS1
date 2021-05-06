package ar.edu.unju.fi.tp4.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Producto;
import ar.edu.unju.fi.tp4.service.IProductoService;

@Service
public class ProductoServiceImp implements IProductoService {


    private static final Log LOGGER = LogFactory.getLog(ProductoServiceImp.class);

    private List<Producto> productosList = new ArrayList<Producto>();

    @Override
    public void addProducto(Producto producto) {
        productosList.add(producto);
        LOGGER.info("SERVICE: IProductoService -> ProductoServiceImp");
        LOGGER.info("METHOD: addProducto - se agregó un objeto producto en la lista -> "+productosList.get(productosList.size()-1));
        LOGGER.info("RESULT: a object producto");
    }
    
    @Override
    public Producto showLastProducto() {
        int indiceLastProduct = productosList.size()-1;
        Producto producto = productosList.get(indiceLastProduct);
        return producto;
    }

    

}
