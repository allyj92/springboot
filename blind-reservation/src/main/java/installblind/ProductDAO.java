package installblind;

import java.util.List;



public interface ProductDAO {
	void insertProduct(ProductVO product);
	List<ProductVO> getAllProducts();
	ProductVO getProductById(int id);
	void updateName(int id, String newName);
}
