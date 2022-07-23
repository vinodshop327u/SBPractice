package com.vinod.demo;

import java.util.List;

public interface IProductService 
{
	List<Product> findAll();
	public Product findUsername(int id);

}
