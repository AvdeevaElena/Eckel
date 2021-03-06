package Chapter7.Task11.TestDeleg;

public class SpaceShipDeleation {

         private String name;
         private SpaceShipControls controls = new SpaceShipControls();

         public SpaceShipDeleation(String name) {
            this.name = name;
        }

// Delegated methods:
    public void back(int velocity) { controls.back(velocity);};
    public void down(int velocity) {controls.down(velocity); };

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public void up(int velocity) {
        controls.up(velocity);
    }
}


