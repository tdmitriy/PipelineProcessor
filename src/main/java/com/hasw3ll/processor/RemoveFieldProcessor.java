package com.hasw3ll.processor;

import java.util.Map;

public class RemoveFieldProcessor implements Processor {

    private Map<String, String> configuration;

    @Override
    public void initialize(Map<String, String> configuration) {
        this.configuration = configuration;
    }

    @Override
    public void process(Map<String, Object> jsonDocument) {
        System.out.println("RemoveFieldProcessor before: " + jsonDocument);
        configuration.forEach((k, v) -> jsonDocument.remove(v));
        System.out.println("RemoveFieldProcessor after: " + jsonDocument);
    }
}
