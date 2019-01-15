package Chapter13.Task5;

/*Exercise 5
/* For each of the basic conversion types in the above table, write the
* most complex formatting expression possible. That is, use all the possible
* format specifiers available for that conversion type.*/

import java.math.BigInteger;
import java.util.Formatter;

public class Test {
    public static void main(String[] args) {
        Formatter f =new  Formatter(System.out);

        f.format( "%s\n","Print intValue" );
        int intValue = 100;
        f.format( "%d\n",intValue );
        f.format( "%c\n",intValue );
        f.format( "%x\n",intValue );
        f.format( "%h\n",intValue );
        f.format("%s\n","Print strValue");


        String strValue = "STR";
        f.format("%s/n", strValue);


        f.format("%s\n","Print charValue");
        char charValue = 'c';
        f.format( "%c\n",charValue  );
        f.format( "%C\n",charValue  );
        f.format( "%H\n",charValue  );
        f.format( "%h\n",charValue  );
        f.format( "%S\n",charValue  );
        f.format( "%s\n",charValue  );

        f.format("%s\n","Print bigValue");
        BigInteger bigValue = new BigInteger("70000000000000");
        f.format( "%x\n",bigValue );
        f.format( "%h\n",bigValue );
        f.format( "%S\n",bigValue  );
        f.format( "%s\n",bigValue  );

        f.format("%s\n","Print doubleValue");
        double doubleValue = 3.1415926535;

        f.format( "%f\n",doubleValue );
        f.format( "%.2f\n",doubleValue );
        f.format( "%e\n",doubleValue );
        f.format( "%h\n",doubleValue );

        f.format("%s\n","Print booleanValue");
        boolean  booleanValue = true;
        f.format( "%h\n",booleanValue );
        f.format( "%b\n",booleanValue  );
        f.format( "%s\n",booleanValue  );


    }

}
