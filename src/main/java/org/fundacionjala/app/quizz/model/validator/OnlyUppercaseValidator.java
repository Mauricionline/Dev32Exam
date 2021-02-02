package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

public class OnlyUppercaseValidator implements Validator {
    private static final String ERROR_MESSAGE = "This question is only upper case";

    @Override
    public void validate(String value, String conditionValue, List<String> errors) {
        if (!value.matches("[A-Z]+")) {
            errors.add(ERROR_MESSAGE);
        }
    }
}
