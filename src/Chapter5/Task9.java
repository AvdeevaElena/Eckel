package Chapter5;
//   Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
public class Task9 {

    int val;
    char aChar;
    String str;

    Task9(int val) {

        this.val=val;
        char aChar = 'f';

        this.aChar = aChar;
    }

    Task9(char aChar) {

        this.aChar=aChar;
    }

    Task9(String str) {

        this.str=str;
    }

    Task9 (){
        //this(1);
        this("str");
    }


}
