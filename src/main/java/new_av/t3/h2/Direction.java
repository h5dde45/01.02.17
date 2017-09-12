package new_av.t3.h2;

public enum Direction {
    UP('U'),
    DOWN('D'),
    LEFT('L'),
    RIGHT('R');

    private final char code;

    Direction(char code) {
        this.code = code;
    }

    public char getCode() {
        return code;
    }

    public Direction opposite() {
        switch (this){
            case DOWN: return UP;
            case LEFT: return RIGHT;
            default: throw new IllegalStateException();
        }
    }
}
