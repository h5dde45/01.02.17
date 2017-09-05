package pa.t8;

public class Calculator {
    private int result;

    public int getResult() {
        return result;
    }

    public void add(int... params) {
        for (int param : params) {
            result += param;
        }
    }

    public void div(int... params) {
        if (params.length > 0) {

        } else {

        }
    }

    public void cteanResult() {
        result = 0;
    }
}
