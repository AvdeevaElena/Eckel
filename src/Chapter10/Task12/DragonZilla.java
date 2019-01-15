package Chapter10.Task12;

public class DragonZilla {

    DangerousMonster dangerousMonster(){
    return new DangerousMonster(){
      public void destroy() {};
      public void menace(){};
      };

    }
}
