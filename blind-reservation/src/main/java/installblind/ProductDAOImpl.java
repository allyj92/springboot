package installblind;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;






public class ProductDAOImpl implements ProductDAO {
	
	private JdbcTemplate jdbcTemplate;	
	
	 public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
	    }
    // VO 매핑 클래스
    private class EmpMapper implements RowMapper<ProductVO> {
        @Override
        public ProductVO mapRow(ResultSet rs, int rowNum) throws SQLException {
        	ProductVO dto = new ProductVO();
        	dto.setId(rs.getInt("id"));
            dto.setName(rs.getString("name"));
            dto.setPrice(rs.getInt("price"));
            dto.setSize(rs.getString("size"));
            dto.setColor(rs.getString("color"));
            dto.setStock(rs.getInt("stock"));
           
            return dto;
        }
    }

	@Override
	public void insertProduct(ProductVO product) {

		String sql = "INSERT INTO products (name,price,\"size\", \"color\",stock) values(?,?,?,?,?)";
		jdbcTemplate.update(sql, product.getName(), product.getPrice(), product.getSize() ,product.getColor(), product.getStock());

	}

	@Override
	public List<ProductVO> getAllProducts() {
		 String sql = "SELECT * FROM products";
		 return jdbcTemplate.query(sql, new EmpMapper());
	}

	@Override
	public ProductVO getProductById(int id) {
		String sql = "SELECT * FROM prodcuts WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new EmpMapper(), id);
	}
	
	@Override
	public void updateName(int id, String newName){
		String sql = "UPDATE products SET name = ? WHERE id = ?";
        jdbcTemplate.update(sql, newName, id );
	}

}
