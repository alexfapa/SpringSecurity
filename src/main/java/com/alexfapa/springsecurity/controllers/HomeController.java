package com.alexfapa.springsecurity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alexfapa.springsecurity.domain.Produto;
import com.alexfapa.springsecurity.services.ProdutoService;

@Controller
public class HomeController {
	
	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	@RequestMapping("/home")
	public String home(Model model) {
		
		Produto pro = new Produto(null, "Bola de Futebol", "Bola de futebol profissional", "https://m.media-amazon.com/images/I/61CbBf7fkUL._AC_SL1050_.jpg" , "https://www.encurtador.com.br/epwIX", 89.99);
		produtoService.save(pro);
		
		pro = new Produto(null, "Bola de Vôlei", "Bola de vôley profissional", "https://m.media-amazon.com/images/I/61iMP-G9DfL._AC_SL1300_.jpg" , "https://www.encurtador.com.br/zJRTX", 137.79);
		produtoService.save(pro);
		
		List<Produto> produtos = produtoService.findAll();
		model.addAttribute("produtos", produtos);
		return "home";
	}
}
