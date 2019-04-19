package com.epam.patterns.lsp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;



class GenericUser {

    private Map<String, Boolean> accessRights = new HashMap<>();

    GenericUser() {

    }

    GenericUser(HashSet<String> forbiddenRights) {
        for ( String s : forbiddenRights){
            this.accessRights.put(s, false);
        }
    }

    private boolean canAddAccessRight(String right) {
        return !this.accessRights.containsKey(right) || this.accessRights.get(right).equals(true);
    }

    void setupAccessRight(String right, boolean value) {
        if (canAddAccessRight(right)) {
            this.putAccessRight(right,value);
        }
    }

    void putAccessRight(String right, boolean value) {
        this.accessRights.put(right,value);
    }

    boolean getValueOfAccessRight(String right) {
        return accessRights.getOrDefault(right, false);
    }

}
