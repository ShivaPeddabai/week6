package state.glass;



public class Shotglass
{
    IdleState idleState;
    DelicateState delicateState;
    FullState fullState;
    BrokenState brokenState;
    State state;

    Shotglass()
    {
        idleState = new IdleState(this);
        delicateState= new DelicateState(this);
        brokenState = new BrokenState(this);
        fullState=new FullState(this);
        state=fullState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public IdleState getIdleState() {
        return idleState;
    }

    public DelicateState getDelicateState() {
        return delicateState;
    }

    public FullState getFullState() {
        return fullState;
    }

    public BrokenState getBrokenState() {
        return brokenState;
    }

    public void fullShotglass()  {
        state.fullShotglass();
    }

    public void idleShotglass()  {
        state.idleShotglass();
    }

    public void delicateShotglass() {
        state.delicateShotglass();
    }
    public void brokenShotglass() {
        state.brokenShotglass();
    }

    public String toString() {
        StringBuffer sbuffer=new StringBuffer();

        sbuffer.append("\nShotglass State  \nShotglass "+state);

        return sbuffer.toString();
    }
}
