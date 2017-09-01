package va.t3.p1;

@Version(value = "1.1",date = "01.09.17")
public class CharSequenceImpl implements MyCharSequence {

    char[]data;

    @Override
    public int length() {
        return data.length;
    }

    @Override
    public char charAt(int i) {
        return data[i];
    }

    @Override
    public MyCharSequence sunSequence(int start, int end) {
        return new CharSequenceImpl();
    }

}
