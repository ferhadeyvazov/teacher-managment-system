package common;

import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@Repeatable(Authors.class)
@Documented
public @interface Author {
    String name();
    String date();
}
