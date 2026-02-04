
public class WeeklyHours {
    public static void main(String[] args) {
        // Two-dimensional array storing work hours for 8 employees
        // Each row: [Su, M, T, W, Th, F, Sa]
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},  // Employee 0
                {7, 3, 4, 3, 3, 4, 4},  // Employee 1
                {3, 3, 4, 3, 3, 2, 2},  // Employee 2
                {9, 3, 4, 7, 3, 4, 1},  // Employee 3
                {3, 5, 4, 3, 6, 3, 8},  // Employee 4
                {3, 4, 4, 6, 3, 4, 4},  // Employee 5
                {3, 7, 4, 8, 3, 8, 4},  // Employee 6
                {6, 3, 5, 9, 2, 7, 9}   // Employee 7
        };

        // Array to store total hours for each employee
        int[] totalHours = new int[hours.length];

        // Calculate total hours for each employee
        for (int i = 0; i < hours.length; i++) {
            int sum = 0;
            for (int j = 0; j < hours[i].length; j++) {
                sum += hours[i][j];
            }
            totalHours[i] = sum;
        }

        // Display each employee's total hours
        for (int i = 0; i < totalHours.length; i++) {
            System.out.println("Employee " + i + "'s total hours is " + totalHours[i]);
        }

        // Find employee with largest total hours
        int maxIndex = 0;
        int maxHours = totalHours[0];
        for (int i = 1; i < totalHours.length; i++) {
            if (totalHours[i] > maxHours) {
                maxHours = totalHours[i];
                maxIndex = i;
            }
        }

        // Find employee with smallest total hours
        int minIndex = 0;
        int minHours = totalHours[0];
        for (int i = 1; i < totalHours.length; i++) {
            if (totalHours[i] < minHours) {
                minHours = totalHours[i];
                minIndex = i;
            }
        }

        // Display results
        System.out.println("Employee with the largest total working hours:");
        System.out.println("Employee " + maxIndex + " with " + maxHours + " hours");
        System.out.println("Employee with the smallest total working hours:");
        System.out.println("Employee " + minIndex + " with " + minHours + " hours");
    }
}