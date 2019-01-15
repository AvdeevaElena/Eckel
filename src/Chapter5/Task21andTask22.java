package Chapter5;

        /*Exercise 21: (1) Create an enum of the least-valuable six types of paper currency. Loop through the values( )
        and print each value and its ordinal( ).
        Exercise 22: (2) Write a switch statement for the enum in the previous example. For each case, output a description
        of that particular currency. */




public class Task21andTask22 {

    public static void main(String[] args) {
        for (PaperCurrency pc: PaperCurrency.values()) {
            System.out.println(pc +" - "+pc.ordinal());
        }

        System.out.println("Exercise 22:");

        PaperCurrency pc = PaperCurrency.THOUTHAND;

            switch (pc){
                case TEN: System.out.println(pc.name()+" "+pc.ordinal());break;
                case FIFTY: System.out.println(pc.name()+" "+pc.ordinal());break;
                case FIVEHUNDRED: System.out.println(pc.name()+" "+pc.ordinal());break;
                case THOUTHAND: System.out.println(pc.name()+" "+pc.ordinal());break;

                default:System.out.println("PaperCurrency");
            }
        }
    }


