package K_Annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Categories.class)
@interface Category {
    String name();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Categories {
    Category[] value();
}