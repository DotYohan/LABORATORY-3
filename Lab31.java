package lab.pkg3.pkg1;

import javax.swing.JOptionPane;

public class Lab31 {

    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {
            String choose = JOptionPane.showInputDialog("Choose a set\n"
                    + "Code \t packages\n"
                    + "1 \t Sum and Average of Array and Frequency Counter\n"
                    + "2 \t Maximum and Minimum\n"
                    + "3 \t Reverse an Array");

            switch (choose) {
                case "1":
                    sumAndAverageAndFrequencyCounter();
                    break;
                case "2":
                    findMaxAndMin();
                    break;
                case "3":
                    reverseArray();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
            
            int response = JOptionPane.showConfirmDialog(null, "Do you want to perform another operation?", "Continue", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.NO_OPTION) {
                loop = false;
            }
        }
    }

    private static void sumAndAverageAndFrequencyCounter() {
        int n = 10;
        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            String dec = JOptionPane.showInputDialog("Enter number " + (i + 1) + ":");
            numbers[i] = Double.parseDouble(dec);
        }

        // Sum and Average
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        double average = sum / n;
        JOptionPane.showMessageDialog(null, "Sum of array: " + sum);
        JOptionPane.showMessageDialog(null, "Average of array: " + average);

        // Frequency Counter
        java.util.HashMap<Double, Integer> frequencyMap = new java.util.HashMap<>();
        for (double number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        StringBuilder frequencyCount = new StringBuilder("Frequency count:\n");
        for (java.util.Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            frequencyCount.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        JOptionPane.showMessageDialog(null, frequencyCount.toString());
    }

    private static void findMaxAndMin() {
        int n = 10;
        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            String dec = JOptionPane.showInputDialog("Enter number " + (i + 1) + ":");
            numbers[i] = Double.parseDouble(dec);
        }

        double max = numbers[0];
        double min = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Maximum element: " + max);
        JOptionPane.showMessageDialog(null, "Minimum element: " + min);
    }

    private static void reverseArray() {
        int n = 10;
        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            String dec = JOptionPane.showInputDialog("Enter number " + (i + 1) + ":");
            numbers[i] = Double.parseDouble(dec);
        }

        for (int i = 0; i < n / 2; i++) {
            double temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }

        StringBuilder reversedArray = new StringBuilder("Reversed array: ");
        for (double number : numbers) {
            reversedArray.append(number).append(" ");
        }
        JOptionPane.showMessageDialog(null, reversedArray.toString());
    }
}
