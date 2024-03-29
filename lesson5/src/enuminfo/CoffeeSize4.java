package enuminfo;

public enum CoffeeSize4 {
    BIG(100) {
        @Override
        public String toString() {
            return "BIG ENUM";
        }
        @Override
        public String getLidCode() {
            return "AA";
        }
    },
    HUGE(150),
    OVERWHELMING(200) {
        @Override
        public String getLidCode() {
            return "A";
        }
    };

    private int ml;

    CoffeeSize4(int ml) {
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }

    public String getLidCode() {
        return "B";
    }
}
