package Chapter20.Task1.TableCreator;

public @interface Constraints {

    boolean primaryKey() default false;
	boolean allowNull() default true;
	boolean unique() default false;
}
