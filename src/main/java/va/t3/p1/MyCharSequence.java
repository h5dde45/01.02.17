package va.t3.p1;

public interface MyCharSequence {

    int length();

    char charAt(int i);

    MyCharSequence sunSequence(int start, int end);

    default MyCharSequence sunSequence(int start){
        return sunSequence(start,length());
    }


}
