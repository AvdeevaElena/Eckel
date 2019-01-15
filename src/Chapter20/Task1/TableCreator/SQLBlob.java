package Chapter20.Task1.TableCreator;

import javax.swing.*;

public @interface SQLBlob {

    String name() default "";
	SpringLayout.Constraints contstraints() default @Constraints;
}
