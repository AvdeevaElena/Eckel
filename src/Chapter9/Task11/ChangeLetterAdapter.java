package Chapter9.Task11;

public class ChangeLetterAdapter implements  Processor{

    ChangeLetter changeLetter;

    ChangeLetterAdapter(ChangeLetter changeLetter){
        this.changeLetter = changeLetter;

    }
    @Override
    public String name() {
        return "ChangeLetterAdapter";
    }

    @Override
    public Object process(Object input) {
        return  changeLetter.change((String)input);
    }



    public static void main(String[] args) {
        ChangeLetter changeLetter = new ChangeLetter();
        ChangeLetterAdapter changeLetterAdapter = new ChangeLetterAdapter(changeLetter);
        String str = "Расписание в Санкт-Петербурге";
       // changeLetterAdapter.changeAdapter(str);
        //Apply.process(new ChangeLetterAdapter(new ChangeLetter()), str);

    }
}
