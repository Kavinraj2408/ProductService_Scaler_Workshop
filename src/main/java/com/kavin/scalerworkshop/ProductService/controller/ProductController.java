package com.kavin.scalerworkshop.ProductService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kavin.scalerworkshop.ProductService.entity.Product;
import com.kavin.scalerworkshop.ProductService.model.UserModel;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	RestTemplate restTemp;
	
	@GetMapping("/details")
	public Product getProductDetailsById(@RequestParam("user_id") long userId, @RequestParam("product_id") long productId) {
		Product product = new Product();
		product.setName("Iphone 15 Pro max");
		product.setDescription("good product");
		product.setImageUrl("http://localhost");
		product.setPublic(false);
		product.setPrice(150000.50);
		
		ResponseEntity<UserModel> response = null;
		if(!(product.isPublic())) {
			response = restTemp.getForEntity("http://USER-SERVICE/users/"+userId, UserModel.class);
			UserModel user = response.getBody();
			if(!(user.isAdmin())) {
				return new Product();
			}
		}
		
		return product;
		
	}

}
