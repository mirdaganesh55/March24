package com.java.jsp;

import java.util.List;

public class ProductController {
	
	private Product product;
	private ProductDAOImpl productDao;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public ProductDAOImpl getProductDao() {
		return productDao;
	}
	public void setProductDao(ProductDAOImpl productDao) {
		this.productDao = productDao;
	}

	public List<Product> showProducts(){
		return productDao.showProductsDao();
	}
	public void navigateToProductDetails() {
		
	}
	
}
