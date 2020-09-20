public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isBlank()) {
            return 0;
        }
        String[] split = numbers.split(",");
        return Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
    }
}
