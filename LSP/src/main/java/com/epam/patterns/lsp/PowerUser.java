package com.epam.patterns.lsp;

import java.util.*;

class PowerUser extends GenericUser {

    @Override
    void setupAccessRight(String right, boolean value) {
        super.putAccessRight(right, value);
    }
}
