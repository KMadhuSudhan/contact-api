package com.pilvo.contacts.api.validations;

import com.google.inject.Inject;
import com.pilvo.contacts.api.data.services.factories.DataServiceBuilderFactory;
import com.pilvo.contacts.api.exceptions.ValidationFailedException;
import com.pilvo.contacts.api.models.AbstractModel;

public abstract class AbstractValidation<T extends AbstractModel> {
    @Inject
    DataServiceBuilderFactory dataServiceBuilderFactory;

    public abstract T createRecordValidations(T model) throws ValidationFailedException;
    public abstract void fetchRecordValidations(long id) throws ValidationFailedException;
    public abstract void updateRecordValidations(T model) throws ValidationFailedException;
    public abstract void deleteRecordValidations(long id) throws ValidationFailedException;
}
