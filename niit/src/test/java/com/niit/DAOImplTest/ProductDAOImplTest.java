package com.niit.DAOImplTest;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.ProductDAO;
import com.niit.DAOImpl.ProductDAOImpl;
import com.niit.DBConfig.DBConfig;
import com.niit.model.Product;

import junit.framework.TestCase;

public class ProductDAOImplTest extends TestCase {
	 ApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class,ProductDAOImpl.class);
	   ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
	   Product product= new Product();

	  @Test		
		public void testAddProduct() {
			product.setProductId(1);
			product.setProductPrice(100); 
			product.setProductQuantity(1);
			product.setProductName("mobile");
			product.setProductDescription("Blue color - l litre");
			boolean p=productDAO.addProduct(product);
			assertTrue(product.getProductId()>0);  
		}	
		
	

@Test
public void testFindAllProduct() {
		List<Product> productList = productDAO.findAllProduct();
		product.setProductId(1);
		product.setProductName("mobile");
		product.setProductDescription("apple");
		product.setProductSize(2);
		product.setProductQuantity(2);
		product.setProductPrice(1000);
		
	
}
@Test
	public void testFindProductById() {
		Product product = productDAO.findProductById(37);
	    product.setProductId(2);
	    product.setProductName("headset");
	    product.setProductDescription("black");
	    product.setProductSize(2);
		product.setProductQuantity(5);
		product.setProductPrice(1500);
		
	
	}
@Test
	public void testFindProductByName() {
		Product product = productDAO.findProductByName("mobile");
		product.getProductId();
		product.getProductName();
		product.getProductDescription();
		product.getProductSize();
		product.getProductQuantity();
		product.getProductPrice();
		
	}

@Test
	public void testUpdateProduct() {
		List<Product> productList = productDAO.findAllProduct();
		product.setProductId(37);
		product.setProductPrice(2000);
		product.setProductQuantity(25);
		assertTrue(product.getProductPrice()==2000);
		assertTrue(product.getProductQuantity()==25);
		boolean p=productDAO.updateProduct(product);
		assertTrue(product.getProductId()>0); 
		
	}
		
	
	/*
	public void testDeleteProduct() {
		List<Product> productList = productDAO.findAllProduct();
	        product.setProductId(2);
			product.setProductName("headset");
		    product.setProductDescription("black");
			product.setProductSize(2);
		    product.setProductQuantity(5);
		    product.setProductPrice(1500);
		    boolean p=productDAO.deleteProduct(2);
			assertTrue(product.getProductId()>0); 
		
	
			
}*/

}
