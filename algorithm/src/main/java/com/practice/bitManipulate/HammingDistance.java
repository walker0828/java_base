package com.practice.bitManipulate;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int result = 0;
        char[] binary_x = getBinary(x);
        char[] binary_y = getBinary(y);
        compensate(binary_x,binary_y);
        for(int i = 0; i< binary_x.length; i++) {
            if(binary_x[i] != binary_y[i]) {
                result++;
            }
        }
        return result;
    }

    char[] getBinary(int x) {
        return null;
    }

    void compensate(char[] x, char[] y) {

    }
}
