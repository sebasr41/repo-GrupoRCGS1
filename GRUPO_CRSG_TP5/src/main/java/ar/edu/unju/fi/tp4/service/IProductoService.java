package ar.edu.unju.fi.tp4.service;

import ar.edu.unju.fi.tp4.model.Producto;

public interface IProductoService {
    public void addProducto(Producto producto);

    public Producto showLastProducto();

}
