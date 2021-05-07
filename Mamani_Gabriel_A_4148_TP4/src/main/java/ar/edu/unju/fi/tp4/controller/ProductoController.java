package ar.edu.unju.fi.tp4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp4.model.Producto;
import ar.edu.unju.fi.tp4.service.IProductoService;

@Controller
public class ProductoController {
	@Autowired
	private IProductoService productoService;

	@Autowired
	private Producto producto;
	
	@GetMapping("/producto")
	public String getProductoPage(Model model) {
		model.addAttribute(producto);
		return "nuevo-producto";
	}
	@PostMapping("/producto-guardar")
	public String addProductoPage(@ModelAttribute("producto") Producto producto){
		productoService.addProducto(producto);
		return "resultado-producto";
	}
	@GetMapping("/producto-ultimo")
	public ModelAndView showLastProductPage(){
		
		ModelAndView model = new ModelAndView("ultimo-producto");
		model.addObject("producto", productoService.showLastProducto());
		
		return model;
	}
	
}
