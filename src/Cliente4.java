public class Cliente4 implements Observer, DisplayElement {
    private float versionActual = 11;
    private Cellphone cellPhone;

    public Cliente4(Cellphone cellPhone) {
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
        System.out.println("Email Cliente4: Ya esta disponible la version " + versionActual
                + " del IPhone");
    }
}
