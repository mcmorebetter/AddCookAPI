package com.github.teamhungry22.addcook.api;

import java.io.Serial;

public class AddCookNotFoundException extends UnsupportedOperationException {
    @Serial
    private static final long serialVersionUID = 1L;

    public AddCookNotFoundException() {
        super("Error: AddCook not found!");
    }
}