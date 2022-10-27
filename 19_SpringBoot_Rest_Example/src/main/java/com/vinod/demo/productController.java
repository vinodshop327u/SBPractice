package com.vinod.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController 
{
	//http://localhost:9090/hello
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello World123";
	}

	@Autowired  
	private IProductService productService;  
	//mapping the getProduct() method to /product
	
	//http://localhost:9090/product
	@GetMapping(value = "/product")  
	public List<Product> getProduct()   
	{  
		//finds all the products  
		List<Product> products = productService.findAll();  
		//returns the product list  
		return products;  
	}  
	
	//http://localhost:9090/product/107
	@GetMapping(value = "/product/{empid}")  
	public Product getProductusername(@PathVariable int empid )   
	{  
		System.out.println("id=  "+empid);
		Product products = productService.findUsername(empid);  
		//returns the product list  
		return products;  
	}  
}
