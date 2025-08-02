package installblind;
import lombok.Data;

@Data
public class ProductVO {
	private int id;
    private String name;
    private int price;
    private String size;
    private String color;
    private int stock;

    // 기본 생성자
    public ProductVO() {}

    // 전체 필드를 사용하는 생성자
    public ProductVO(int id, String name, int price, String size, String color, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
        this.stock = stock;
    }

  

    @Override
    public String toString() {
        return "[상품번호: " + id +
               ", 이름: " + name +
               ", 가격: " + price +
               ", 사이즈: " + size +
               ", 색상: " + color +
               ", 재고: " + stock + "]";
    }
}
