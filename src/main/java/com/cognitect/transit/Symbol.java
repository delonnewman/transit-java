// Copyright (c) Cognitect, Inc.
// All rights reserved.

package com.cognitect.transit;

public class Symbol {

    public final String value;

    public Symbol(String s) {
        value = s;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {

        if(o instanceof Symbol && ((Symbol)o).value.equals(value))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
