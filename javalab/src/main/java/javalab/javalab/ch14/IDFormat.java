package javalab.javalab.ch14;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IDFormat {
    private String userId;

    // 메서드가  지정된 예외를 던질 수 있다.
    public void setUserId(String userId) throws IDFormatException {
        if(userId == null){
            throw new IDFormatException("아이디는 null이 될 수 없습니다.");
        }
        else if (userId.length() < 8 || userId.length() > 20){
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용하세요.");
        }

        this.userId = userId;
    }

    @Override
    public String toString() {
        return "IDFormat{" +
                "userId='" + userId + '\'' +
                '}';
    }
}
