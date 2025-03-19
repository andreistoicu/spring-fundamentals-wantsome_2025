package com.wantsome.layered.domain_dao.constraints;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = NoNumbersValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NoNumbers {
    String message() default "Name must not contain numbers";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
