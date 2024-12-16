package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//MyIncludeComponent가 붙은거를 component에 추가한다
public @interface MyIncludeComponent {
}
