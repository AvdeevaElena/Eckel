package Chapter10.Task12;

public class VeryBadVampire {

    Vampire vampire() {
       return new Vampire() {
           @Override
           public void drinkBlood() {
           }
           @Override
           public void destroy() {
           }
           @Override
           public void kill() {
           }
           @Override
           public void menace() {
           }
       };


    }
}
