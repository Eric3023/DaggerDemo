package picturedemo.dong.com.daggerdemo.qulifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Dong on 2016/12/8.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface B {
}
