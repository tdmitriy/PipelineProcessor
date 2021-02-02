package com.hasw3ll.processor;

import java.util.Map;

public class AddFieldProcessor implements Processor {

    private Map<String, String> configuration;

    @Override
    public void initialize(Map<String, String> configuration) {
        this.configuration = configuration;
    }

    @Override
    public void process(Map<String, Object> jsonDocument) {
        System.out.println("AddFieldProcessor before: " + jsonDocument);
        configuration.forEach(jsonDocument::put);
        System.out.println("AddFieldProcessor after: " + jsonDocument);
    }
}
