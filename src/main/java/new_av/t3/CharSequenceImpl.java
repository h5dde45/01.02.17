package new_av.t3;


@Version(value = "2.3",date = "11.09.17")
public class CharSequenceImpl implements MyCharSequence,MyCharSequence2 {

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
    public MyCharSequence subSequence(int start, int end) {
        return new CharSequenceImpl();
    }

    @Override
    public MyCharSequence subSequence(int start) {
        return MyCharSequence.super.subSequence(start);
    }


}
