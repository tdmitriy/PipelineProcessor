package com.hasw3ll;

import com.hasw3ll.descriptor.PipelineDescriptor;
import com.hasw3ll.factory.DefaultProcessorFactory;
import com.hasw3ll.processor.Processor;

import java.util.Map;

public class PipelineExecutor {

    public void transform(PipelineDescriptor pipelineDescriptor, Map<String, Object> jsonDocument) {
        DefaultProcessorFactory factory = new DefaultProcessorFactory();
        Processor processor = factory.create(pipelineDescriptor.getProcessor());
        processor.initialize(pipelineDescriptor.getConfiguration());
        processor.process(jsonDocument);
    }
}
