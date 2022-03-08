package com.practice.others;

public class corpFlightBookings {
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];
        for(int i = 0; i< bookings.length; i++) {
            for(int j = bookings[i][0]; j <= bookings[i][1] ; j++) {
                result[j-1] += bookings[i][2];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};
        corpFlightBookings(bookings,5);
    }
}
