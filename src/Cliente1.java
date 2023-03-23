public class Cliente1 implements Observer, DisplayElement {
    private float versionActual = 11;
    private Cellphone cellPhone;

    public Cliente1(Cellphone cellPhone) {
        this.cellPhone = cellPhone;
        cellPhone.registerObserver(this);
    }

    public void update(float version) {
        if (versionActual != version) {
            versionActual = version;
        }

        display();
    }

    public void display() {
        System.out.println("Email Cliente1: Ya esta disponible la version " + versionActual
                + " del IPhone");
    }
}
