package ar.edu.unju.fi.tp4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp4.model.Compra;
import ar.edu.unju.fi.tp4.service.ICompraService;

@Controller
public class CompraController {
	@Autowired
	 ICompraService compraService;
	@Autowired
	private Compra compra;
		
		@GetMapping("/compra")
		public String getCompraPage(Model model) {
			model.addAttribute(compra);
			return "nueva-compra";
		}
		@PostMapping("/compra-guardar")
		public ModelAndView addCompraPage(@ModelAttribute("compra") Compra compra){
			 
			 ModelAndView modelView =  new ModelAndView("compras");
			 compraService.guardarCompra(compra);
			 modelView.addObject("compras", compraService.obtenerCompras());
			 return modelView;
	}
		
	}

