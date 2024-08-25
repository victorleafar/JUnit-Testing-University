package junit;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NumberUtils {
    public List<Integer> add(List<Integer> left, List<Integer> right) {
        if (left == null || right == null)
            return null;

        // Se a lista estiver vazia, trata como 0
        if (left.isEmpty()) left.add(0);
        if (right.isEmpty()) right.add(0);

        Collections.reverse(left);
        Collections.reverse(right);

        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;

        for (int i = 0; i < Math.max(left.size(), right.size()); i++) {
            int leftDigit = i < left.size() ? left.get(i) : 0;
            int rightDigit = i < right.size() ? right.get(i) : 0;

            if (leftDigit < 0 || leftDigit > 9 || rightDigit < 0 || rightDigit > 9)
                throw new IllegalArgumentException("Digits must be between 0 and 9");

            int sum = leftDigit + rightDigit + carry;
            result.addFirst(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.addFirst(carry);
        }

        // Remove leading zeros
        while (result.size() > 1 && result.get(0) == 0) {
            result.remove(0);
        }

        return result;
    }
}
