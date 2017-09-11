package new_av.t3;

public interface MyCharSequence2 {
   default MyCharSequence subSequence(int start){
       return null;
   }
}
