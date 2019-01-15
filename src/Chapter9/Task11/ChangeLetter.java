package Chapter9.Task11;

public class ChangeLetter {

    String change(String str) {

        char chars [] = new char[str.length()];

        if (str.length() % 2 == 0) {
            for (int i = 0; i < str.length(); i= i+2) {
                chars[i] = str.charAt(i + 1);
                chars[i + 1] = str.charAt(i);
            }
        }
        else
        {       for (int i =0; i< str.length(); i= i+2) {
                    chars[i] = str.charAt(i + 1);
                    chars[i + 1] = str.charAt(i);
                }

        }

        return  returnStr(chars);
    }


    String returnStr(char [] arr) {
        String str ="";
        for (int i=0; i<arr.length; i++) {
            str = str+ arr[i];
        }
        return str;

    }

    public static void main(String[] args) {
        ChangeLetter cl = new ChangeLetter();

        System.out.println(cl.change("Иллюстрации к книге Виктор Чижиков"));
    }
}
