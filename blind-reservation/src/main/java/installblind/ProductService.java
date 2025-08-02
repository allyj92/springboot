package installblind;

import java.util.List;

public interface ProductService {
	void registerProduct(ProductVO product); 
	List<ProductVO> viewAllProducts();
	ProductVO viewProduct(int id);
	void updateName(int id,String newName);
}
