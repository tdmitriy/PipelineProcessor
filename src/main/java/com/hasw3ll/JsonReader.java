package com.hasw3ll;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonReader {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static PipelineDescriptorRequest buildDescriptorRequest(String jsonFile) {
        try {
            String path = ClassLoader.getSystemResource(jsonFile).getPath();
            return MAPPER.readValue(new File(path), PipelineDescriptorRequest.class);
        } catch (Exception e) {
            throw new RuntimeException("Can't read and map json " + jsonFile, e);
        }
    }
}
