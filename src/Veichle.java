public abstract class Veichle {
    public final void BuildVeichle()
    {
        CollectComponent();
        assembleComponent();
        installGearbox();
        starVeichle();

        System.out.println("Vechile Is On !! ");
    }

    protected  void starVeichle(){
        System.out.println("Vechile Move on");
    }

    protected abstract void installGearbox();

    protected abstract void assembleComponent();

    protected  void CollectComponent(){
        System.out.println("bring rear , mirrors , chairs ,  wheels");
    }


}
