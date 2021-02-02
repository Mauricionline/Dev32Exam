package org.fundacionjala.app.quizz.model.configuration;

import org.fundacionjala.app.quizz.model.validator.ValidatorType;

import java.text.SimpleDateFormat;

public class NumericConfiguration extends QuestionConfiguration  {
    public NumericConfiguration() {
        super(false, ValidatorType.REQUIRED, ValidatorType.MIN);
    }
}

