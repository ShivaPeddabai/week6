package state.glass;


public class FullState implements State {

    Shotglass shotglass;
    public FullState(Shotglass shotglass) {
        this.shotglass = shotglass;
    }

    @Override
    public void fullShotglass() {
        System.out.println("glass is full to the tip");

    }

    @Override
    public void idleShotglass() {
        System.out.println("nobody is touching the glass");
        shotglass.setState(shotglass.getIdleState());

    }

    @Override
    public void delicateShotglass() {
        System.out.println("delicate glasses - handle with care");
        shotglass.setState(shotglass.getDelicateState());
    }

    @Override
    public void brokenShotglass() {
        System.out.println("the shot glass is broken");
        shotglass.setState(shotglass.getBrokenState());
    }
    public String toString() {
        return "FULL";
    }
}

