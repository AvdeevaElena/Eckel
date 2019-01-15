package Chapter9.Task14;

public class allToGether extends Alfa implements D{

    @Override
    public void d_1() {

    }


    @Override
    public void a_1() {

    }

    @Override
    public void a_2() {

    }

    public void dd_1 (D d) {d.d_1();};
    public void aa_1 (A a) {a.a_1();};
    public void aa_2 (A a) {a.a_2();};
    public void  go_go(Alfa alfa) {alfa.go();};

    public static void main(String[] args) {
    allToGether  at = new allToGether();
    at.aa_1(at);
    at.aa_2(at);
    at.go_go(at);
    at.dd_1(at);
    }

}
