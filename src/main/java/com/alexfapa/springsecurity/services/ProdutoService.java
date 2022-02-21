package com.alexfapa.springsecurity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexfapa.springsecurity.domain.Produto;
import com.alexfapa.springsecurity.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> findAll(){
		return produtoRepository.findAll();
	}
	
	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}
}
