package io.anviksha.library.lib;

import io.anviksha.library.privy.MathUtils;

public class MagicDice {
    public static int rollDice() {
        int r = MathUtils.randomNumber();
        return r == 0 ? r + 1 : r > 6 ? r % 6 : r;
    }
}
