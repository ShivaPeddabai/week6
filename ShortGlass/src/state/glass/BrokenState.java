package state.glass;



public class BrokenState implements State {

    Shotglass shotglass;
    public BrokenState(Shotglass shotglass) {
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
    }

    @Override
    public void delicateShotglass() {
        System.out.println("delicate glasses - handle with care");

    }

    @Override
    public void brokenShotglass() {
        System.out.println("the glass is broken");

    }

    public String toString() {
        return "BROKE";
    }

}


