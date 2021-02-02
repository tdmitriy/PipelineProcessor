package com.hasw3ll.processor;

import java.util.Map;

public interface Processor {
    void initialize(Map<String, String> configuration);

    void process(Map<String, Object> jsonDocument);
}
