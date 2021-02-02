package com.hasw3ll.processor;

import java.util.Map;

public class CountNumOfFieldsProcessor implements Processor {
    private Map<String, String> configuration;

    @Override
    public void initialize(Map<String, String> configuration) {
        this.configuration = configuration;
    }

    @Override
    public void process(Map<String, Object> jsonDocument) {
        int countOfFields = jsonDocument.keySet().size();
        configuration.forEach((k, v) -> jsonDocument.put(v, countOfFields));
        System.out.println("CountNumOfFieldsProcessor -- " + jsonDocument);
    }
}
