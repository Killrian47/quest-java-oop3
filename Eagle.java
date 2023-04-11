public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println(this.getName() + " take off in the sky");
    }

    @Override
    public void ascend(int meters) {
        this.altitude = this.altitude + meters;
        System.out.println(this.getName() + " flies upward, altitude : " + this.altitude);
    }

    @Override
    public void glide() {
        System.out.println("Glide in the air");    
    }

    @Override
    public void descend(int meters) {
        this.altitude = this.altitude - meters;
        System.out.println(getName() + " flies downward, altitude : " + this.altitude);    
    }

    @Override
    public void land() {
        if (this.altitude == 0 || this.altitude == 1) {
            System.out.println(getName() + " land in the ground");
        } else {
            System.out.println(getName() + " is too high, he can't land");
        }
    }
}
