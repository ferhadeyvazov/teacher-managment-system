package common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//Runtime-da movcuddur
@Target(ElementType.TYPE)
public @interface DatabaseTable {
    String tableName();
    String schema() default "public";
}
