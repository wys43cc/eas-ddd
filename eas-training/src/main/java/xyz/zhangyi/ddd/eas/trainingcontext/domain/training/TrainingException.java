package xyz.zhangyi.ddd.eas.trainingcontext.domain.training;

import xyz.zhangyi.ddd.eas.core.domain.exceptions.DomainException;

public class TrainingException extends DomainException {

    public TrainingException(String message) {
        super(message);
    }
}