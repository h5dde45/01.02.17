package va.t3.p1;

public enum Direction {
    UP('U'),
    DOUW('D'),
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

        if(this==LEFT){ //
            return RIGHT;
        }

        switch (this){
            case UP: return DOUW;
            case DOUW: return UP;
//            case LEFT: return RIGHT;
            case RIGHT: return LEFT;
            default: throw  new IllegalStateException();
        }
    }
}
