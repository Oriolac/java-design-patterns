package cat.udl.ampli.adapter.plus;

public class Client implements RequiredInterface {

    private final int a;

    public Client(int a) {
        this.a = a;
    }

    @Override
    public int suma(int b) {
        return a + b;
    }
}
