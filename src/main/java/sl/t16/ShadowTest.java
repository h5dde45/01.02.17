package sl.t16;

public class ShadowTest {

    public int x=4;

    class FirstLevel {
        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(ShadowTest.this.x);
        }

        void doSmth() {
            int x = 10;
            class MemberLocal {
                 MemberLocal() {
                    System.out.println(x);
                }
            }
            MemberLocal ml=new MemberLocal();
        }

    }

    public static void main(String[] args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(33);
        fl.doSmth();
    }
}
