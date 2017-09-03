package com.devsync.app.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Any component annotated with this annotation would be considered a ViewModel.
 *
 * A ViewModel component is a part of the presentation layer which would hold all the properties
 * required while rendering a View component.
 */
@Documented
@Target({ElementType.TYPE})
public @interface ViewModel {
}
