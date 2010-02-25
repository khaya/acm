/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydomain.scm.utils;

import java.util.Random;

/**
 *
 * @author khaya
 */
public class RandomGenerator {

    private Random random;
    private static RandomGenerator instance = null;

    private RandomGenerator() {
    }

    private RandomGenerator(long seed) {
        random = new Random(seed);
    }

    public static RandomGenerator getInstance() {
        if (instance == null) {
            instance = new RandomGenerator(System.currentTimeMillis());
        }
        return instance;
    }

    public static RandomGenerator getInstance(long seed) {
        if (instance == null) {
            instance = new RandomGenerator(seed);
        } else {
            instance.setSeed(seed);
        }
        return instance;
    }

    public void setSeed(long seed) {
        random.setSeed(seed);
    }

    public int nextInt() {
        return random.nextInt();
    }

    public int nextInt(int max) {
        return random.nextInt(max);
    }

    public int nextInt(int min, int max) {
        int var = random.nextInt((max - min));
        return (min + var);
    }

    public long nextLong() {
        return random.nextLong();
    }

    public boolean nextBoolean() {
        return random.nextBoolean();
    }
}
