package com.java.jsp;

import java.util.List;
import java.util.Map;
import javax.faces.context.FacesContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductDAOImpl implements ProductDAO	{

	SessionFactory sf;
	Session session;

	@Override
	public List<Product> showProductsDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Product.class);
		List<Product> productList = cr.list();
		System.out.println("Entered _-------------------"+productList);
		return productList;
	}
}
