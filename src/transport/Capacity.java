package transport;

public enum Capacity {
        VERY_SMALL (0, 10),
        SMALL (11, 25),
        MIDDLE (26, 50),
        BIG (51, 80),
        VERY_BIG (81, 120);
        private int min;
        private int max;

        Capacity(int min, int max) {
            this.min = min;
            this.max = max;
        }
        public static Capacity getValue(int value) {
            for (Capacity i : Capacity.values()) {
                if (value >= i.getMin() && value<= i.getMax()) {
                    System.out.println(i);
                    return i;
                }
            }
            return null;
        }
        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }


    }
