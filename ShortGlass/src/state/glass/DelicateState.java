package state.glass;



public class DelicateState implements State {

    Shotglass shotglass;
    public DelicateState(Shotglass shotglass) {
        this.shotglass = shotglass;
    }

    @Override
    public void fullShotglass() {
        System.out.println("glass is full to the tip");
        shotglass.setState(shotglass.getFullState());
    }

    @Override
    public void idleShotglass() {
        System.out.println("nobody is touching the glass");
        shotglass.setState(shotglass.getIdleState());
    }

    @Override
    public void delicateShotglass() {
        System.out.println("delicate glasses - handle with care");
    }

    @Override
    public void brokenShotglass() {
        System.out.println("the shot glass is broken");
        shotglass.setState(shotglass.getBrokenState());
    }

    public String toString() {
        return "DELICATE";
    }

}