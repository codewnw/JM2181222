package com.jm2181222.annotation.comment;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target({ TYPE })
public @interface ClassInfo {
	String author();

	String date();

	String[] reviewers();

	double version();
}
