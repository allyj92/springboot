package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//MyExcludeComponent가 붙은거를 component에서 제외한다
public @interface MyExcludeComponent {
}
