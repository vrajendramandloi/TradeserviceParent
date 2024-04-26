package com.util.uni.productsService.controller;

import com.util.uni.productsService.model.Products;
import com.util.uni.productsService.service.ProductsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class ProductsMainController {
	private static final Logger logger = LoggerFactory.getLogger(ProductsMainController.class);

	@Autowired
	private ProductsService productsService;

	@RequestMapping(value="/addProduct", method= RequestMethod.POST)
	public void addProduct(@RequestBody Products product) {
		System.out.println("Products "+ product.toString());
		productsService.addUser(product);
	}

	@RequestMapping(value="/getAllProducts", method= RequestMethod.GET)
	public String getAllProducts() {
		return productsService.getAllProducts().toString();
	}
}


