package installblind;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Spring 컨테이너 로딩 (application-config.xml)
        AbstractApplicationContext context =
        new GenericXmlApplicationContext("classpath:config/application-config.xml");
        
     // 빈 꺼내오기 (DI)
        ProductService productService = context.getBean("productService", ProductService.class);
        
     
     Scanner sc = new Scanner(System.in);   
     
     while(true) {
    	 System.out.println("\n🪟 === 블라인드 상품 시스템 ===");
         System.out.println("1. 상품 등록");
         System.out.println("2. 전체 상품 조회");
         System.out.println("3.해당 상품 업데이트");
         System.out.println("0. 종료");
         System.out.print("번호 선택: ");
         int menu = sc.nextInt();
         sc.nextLine(); // 엔터 제거
         
         if(menu == 1) {
        	 System.out.println("상품 이름: ");
        	 String name = sc.nextLine();
        
        	 
        	 System.out.println("가격: ");
        	 int price = sc.nextInt();
        	
        	 System.out.println("사이즈: 120x200): ");
        	 String size = sc.nextLine();
        	 
        	 System.out.println("색상: ");
        	 String color = sc.nextLine();
        	
        	 
        	 System.out.println("재고 수량: ");
        	 int stock = sc.nextInt();sc.nextLine();
        	 
        	 ProductVO dto = new ProductVO();
        	 dto.setName(name);
        	 dto.setPrice(price);
        	 dto.setSize(size);
        	 dto.setColor(color);
        	 dto.setStock(stock);
        	 
        	 productService.registerProduct(dto);
        	 System.out.println("상품이 성공적으로 등록되었습니다.");	
         }else if(menu == 2) {
        	 List<ProductVO> list = productService.viewAllProducts();
        	 System.out.println("전체 상품 등록");
        	 list.stream().forEach(x -> System.out.println(x));
         }else if (menu == 3) {
        	 System.out.println("바꿀 번호: ");
        	 int id = sc.nextInt();
        	 sc.nextLine();  // ⭐ 개행 제거 ⭐

        	 System.out.println("바꿀 이름: ");
        	 String newName = sc.nextLine().trim();

        	 if (newName.isEmpty()) {
        	     System.out.println("⚠ 이름은 비워둘 수 없습니다.");
        	     return;
        	 }

        	 productService.updateName(id, newName);
        	 
         }
     }
        
	}
	

}
