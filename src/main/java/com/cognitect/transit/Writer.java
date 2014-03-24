package com.cognitect.transit;

public interface Writer {

    public static final String ESC = "~";
    public static final String TAG = "#";
    public static final String SUB = "^";
    public static final String RESERVED = "`";
    public static final String ESC_TAG = "~#";
    public static final int MIN_SIZE_CACHEABLE = 3;
    public static final int MAX_CACHE_ENTRIES = 94;
    public static final int BASE_CHAR_IDX = 33;

    void write(Object o) throws Exception;
}