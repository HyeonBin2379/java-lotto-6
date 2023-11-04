package lotto.view;

import static lotto.constants.ExceptionMessage.BLANK_INPUT;
import static lotto.constants.ExceptionMessage.ERROR_FORMAT;
import static lotto.constants.ExceptionMessage.SPACE_INCLUDED;
import static lotto.constants.LottoIOMessage.BONUS_NUM_INPUT;
import static lotto.constants.LottoIOMessage.BUYING_COST_INPUT;
import static lotto.constants.LottoIOMessage.WINNING_NUM_INPUT;

import camp.nextstep.edu.missionutils.Console;
import lotto.util.Validation;

public class InputView {

    public String inputBuyingCost() {
        System.out.println(BUYING_COST_INPUT);
        String inputCost = Console.readLine();
        validateInput(inputCost);
        return inputCost;
    }

    public String inputWinnerNumbers() {
        System.out.println(WINNING_NUM_INPUT);
        String inputWinningNum = Console.readLine();
        validateInput(inputWinningNum);
        Validation.validateComma(inputWinningNum);
        return inputWinningNum;
    }

    public String inputBonusNumber() {
        System.out.println(BONUS_NUM_INPUT);
        String inputBonusNum = Console.readLine();
        validateInput(inputBonusNum);
        return inputBonusNum;
    }

    public void validateInput(String input) {
        validateBlankInput(input);
        validateSpaceChar(input);
    }
    public void validateBlankInput(String input) {

        if (input.isBlank()) {
            throw new IllegalArgumentException(String.format(ERROR_FORMAT, BLANK_INPUT+input));
        }
    }
    public void validateSpaceChar(String input) {
        if (input.contains(" ")) {
            throw new IllegalArgumentException(String.format(ERROR_FORMAT, SPACE_INCLUDED+input));
        }
    }
}