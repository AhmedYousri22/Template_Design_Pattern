public class Truck  extends Veichle{

    @Override
    protected void installGearbox() {
        System.out.println("installGearbox for truck");
    }

    @Override
    protected void assembleComponent() {
        System.out.println("assemble component for truck");
    }
}
