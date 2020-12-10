public class Car extends Veichle {

    @Override
    protected void installGearbox() {
        System.out.println("install gearbox for car");
    }

    @Override
    protected void assembleComponent() {
        System.out.println("assemble component for car");
    }
}
