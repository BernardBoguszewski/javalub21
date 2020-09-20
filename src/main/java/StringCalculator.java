public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isBlank()) {
            return 0;
        }
        if (numbers.startsWith("//")) {
            String[] separate = numbers.split("\n");
            String delimiter = separate[0].replaceAll("//", "");
            String[] splitNumbers = separate[1].split(delimiter);
            return addNumbers(splitNumbers);
        }
        String[] split = numbers.split(",|\n");
        return addNumbers(split);
    }

    private int addNumbers(String[] split) {
        int result = 0;
        for (String number : split) {
            result += Integer.parseInt(number);
        }
        return result;
    }
}
