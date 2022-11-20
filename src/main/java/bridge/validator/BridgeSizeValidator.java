package bridge.validator;

import static bridge.validator.ErrorConstants.ERROR_NOT_NUMBER;
import static bridge.validator.ErrorConstants.ERROR_OUT_OF_BRIDGE_RANGE;

public class BridgeSizeValidator {
	public static void validateBridgeSize(String input) {
		validateIsNumber(input);
		validateBridgeSizeRange(Integer.parseInt(input));
	}

	private static void validateIsNumber(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(ERROR_NOT_NUMBER);
		}
	}

	private static void validateBridgeSizeRange(int length) {
		if (!(length >= 3 && length <= 20)) {
			throw new IllegalArgumentException(ERROR_OUT_OF_BRIDGE_RANGE);
		}
	}
}
