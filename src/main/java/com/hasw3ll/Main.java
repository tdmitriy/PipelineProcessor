package com.hasw3ll;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        PipelineDescriptorRequest req = JsonReader.buildDescriptorRequest("pipeline.json");
        PipelineExecutor executor = new PipelineExecutor();
        Map<String, Object> inputJson = new HashMap<>();
        inputJson.put("userName", "FirstName");
        inputJson.put("valueToAdd", "valueToAdd");

        req.getSteps().forEach(step -> executor.transform(step, inputJson));
    }
}
