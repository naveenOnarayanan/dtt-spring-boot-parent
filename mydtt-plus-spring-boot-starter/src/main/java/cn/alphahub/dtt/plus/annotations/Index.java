package cn.alphahub.dtt.plus.annotations;

/**
 * Enter the description of this class here
 *
 * @author weasley
 * @version 1.0.0
 */
public @interface Index {
    String[] columns() default {};
}
