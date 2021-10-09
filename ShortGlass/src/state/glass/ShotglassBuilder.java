package state.glass;


public class ShotglassBuilder implements Builder{

    ShotglassBuilder(){

    }

    @Override
    public Builder Glass() {
        System.out.println("Shotglasses are short in size");
        return this;
    }

    @Override
    public Builder Casting() {
        System.out.println("They are generally for alcoholic beverages");
        return this;
    }

    @Override
    public Builder Cooling() {
        System.out.println("");
        return this;
    }

    @Override
    public Shotglass build() {
        Shotglass s=new Shotglass();
        System.out.println("They dont hold large quantities!");
        return s;
    }
}
