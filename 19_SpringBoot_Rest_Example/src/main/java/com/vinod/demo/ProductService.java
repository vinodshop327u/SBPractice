package com.vinod.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{

	
	@Override  
	public List<Product> findAll()  
	{  
		return getproduct();  
	}  

	public Product findUsername(int id)
	{
		List<Product> products=getproduct();
		Product singleproduct=new Product();
			for (Product product : products)
			{
				System.out.println("23==========="+product.getId());
				if(product.getId()==id)
				{
					singleproduct.setId(product.getId());
					singleproduct.setPname(product.getPname());
					singleproduct.setBatchno(product.getBatchno());	
					singleproduct.setPrice(product.getPrice());
					singleproduct.setNoofproduct(product.getNoofproduct());
					
					System.out.println(singleproduct.toString());
				
				}
			}
			return singleproduct;
	}
	
	public static List<Product> getproduct()
	{
		//creating an object of ArrayList  
		ArrayList<Product> products = new ArrayList<Product>();  
		//adding products to the List  
		products.add(new Product(100, "Mobile", "CLK98123", 9000.00, 6));  
		products.add(new Product(101, "Smart TV", "LGST09167", 60000.00, 3));  
		products.add(new Product(102, "Washing Machine", "38753BK9", 9000.00, 7));  
		products.add(new Product(103, "Laptop", "LHP29OCP", 24000.00, 1));  
		products.add(new Product(104, "Air Conditioner", "ACLG66721", 30000.00, 5));  
		products.add(new Product(105, "Mobile1 ", "12WP9087", 10000.00, 6)); 
		products.add(new Product(106, "Mobile2 ", "12WP9087", 10000.00, 7));
		products.add(new Product(107, "Mobile3 ", "12WP9087", 10000.00, 8));
		products.add(new Product(108, "Mobile4 ", "12WP9087", 10000.00, 9));
		products.add(new Product(109, "Mobile5 ", "12WP9087", 10000.00, 10));
		//returns a list of product  
		return products;
		
	}
	
}
