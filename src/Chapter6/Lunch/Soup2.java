package Chapter6.Lunch;

 class Soup2 {
    private Soup2 () {};
    private static Soup2 soup2 = new Soup2(); // Статический объект в классе

    public static Soup2 access () {           // D статическом классе возвращаем на него ссылку
        return  soup2;
    }

    public void f() {};
}
