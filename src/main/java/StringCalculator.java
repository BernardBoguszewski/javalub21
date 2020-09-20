public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isBlank()) {
            return 0;
        }
        String[] split = numbers.split(",|\n");
        int result = 0;
        for (String number : split) {
            result += Integer.parseInt(number);
        }
        return result;
    }
}
