package Chapter6.Lunch;

 class Soup1 {

     private Soup1(){};
     public static Soup1 makeSoup(){  // Создание объектов в статическом методе
         return new Soup1();
     }
}
