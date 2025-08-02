package installblind;

import java.util.List;

public class ProductServiceImpl implements ProductService {
	
	private ProductDAO productDAO;
	
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}


	public void registerProduct(ProductVO product) {
		// TODO Auto-generated method stub
		productDAO.insertProduct(product);
	}

	public List<ProductVO> viewAllProducts() {
		return productDAO.getAllProducts();
	}

	public ProductVO viewProduct(int id) {
		return productDAO.getProductById(id);
	}
	
	public void updateName(int id,String newName) {
		productDAO.updateName(id, newName);
	}

}
