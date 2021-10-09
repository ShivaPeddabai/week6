package state.glass;


public class Main {

    public static void main(String[] args) {

        ShotglassBuilder glass=new ShotglassBuilder();
        Shotglass shot=glass.Glass().Casting().Cooling().build();


        shot.fullShotglass();

        shot.brokenShotglass();

        shot.delicateShotglass();

        shot.idleShotglass();

        shot.fullShotglass();



    }

}

