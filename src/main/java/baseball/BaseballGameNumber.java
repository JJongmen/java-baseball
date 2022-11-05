package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseballGameNumber {
    public static final int RANGE_START = 1;
    public static final int RANGE_END = 10;
    public static final int NUMBER_SIZE = 3;

    private final List<Integer> numbers;

    public BaseballGameNumber(List<Integer> numbers) {
        validateSize(numbers);
        validateRange(numbers);
        validateDuplicate(numbers);
        this.numbers = numbers;
    }

    private void validateSize(List<Integer> numbers) {
        if (numbers.size() != NUMBER_SIZE) {
            throw new IllegalArgumentException(NUMBER_SIZE + "자리 숫자만 가능합니다.");
        }
    }

    private void validateRange(List<Integer> numbers) {
        for (Integer digit : numbers) {
            if (digit < RANGE_START || digit > RANGE_END) {
                throw new IllegalArgumentException("범위 밖의 숫자가 포함되어 있습니다.");
            }
        }
    }

    private void validateDuplicate(List<Integer> numbers) {
        Set<Integer> nonDuplicateNumbers = new HashSet<>(numbers);
        if (nonDuplicateNumbers.size() != NUMBER_SIZE) {
            throw new IllegalArgumentException("같은 수는 중복될 수 없습니다.");
        }
    }
}