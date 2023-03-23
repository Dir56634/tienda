public class Cliente5 implements Observer, DisplayElement {
    private float versionActual = 10;
    private Cellphone cellPhone;

    public Cliente5(Cellphone cellPhone) {
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
        System.out.println("Email Cliente5: Ya esta disponible la version " + versionActual
                + " del IPhone");
    }
}
