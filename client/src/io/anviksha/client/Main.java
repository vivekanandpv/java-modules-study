package io.anviksha.client;

//  privy package is not exported by the module, hence not accessible here
import io.anviksha.library.lib.MagicDice;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Client rolls: %d", MagicDice.rollDice());
    }
}