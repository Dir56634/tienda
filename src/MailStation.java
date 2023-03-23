public class MailStation {
    public static void main(String[] args) {
        Cellphone cellPhone = new Cellphone();

        Cliente1 cliente1 = new Cliente1(cellPhone);
        Cliente2 cliente2 = new Cliente2(cellPhone);
        Cliente3 cliente3 = new Cliente3(cellPhone);
        Cliente4 cliente4 = new Cliente4(cellPhone);
        Cliente5 cliente5 = new Cliente5(cellPhone);

        cellPhone.setMeasurements(12);

    }
}

