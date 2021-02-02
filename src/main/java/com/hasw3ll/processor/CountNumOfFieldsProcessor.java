package com.hasw3ll.processor;

import java.util.Map;

public class CountNumOfFieldsProcessor implements Processor {
    private Map<String, String> configuration;
    public static final String COUNT_FIELD_NAME = "numOfFields";

    @Override
    public void initialize(Map<String, String> configuration) {
        this.configuration = configuration;
    }

    @Override
    public void process(Map<String, Object> jsonDocument) {
        int countOfFields = jsonDocument.keySet().size();
        jsonDocument.put(COUNT_FIELD_NAME, countOfFields);

        System.out.println("CountNumOfFieldsProcessor -- " + jsonDocument);
    }
}
