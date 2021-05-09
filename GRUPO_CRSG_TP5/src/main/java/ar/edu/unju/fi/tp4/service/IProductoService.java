package ar.edu.unju.fi.tp4.service;

import java.util.List;

import ar.edu.unju.fi.tp4.model.Producto;

public interface IProductoService {
    public void addProducto(Producto producto);

    public List<Producto> showLastProducto();
    
    public void generarTablaLProducto();

}
