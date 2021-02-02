package com.hasw3ll.factory;

import com.hasw3ll.processor.AddFieldProcessor;
import com.hasw3ll.processor.CountNumOfFieldsProcessor;
import com.hasw3ll.processor.Processor;
import com.hasw3ll.processor.RemoveFieldProcessor;

public class DefaultProcessorFactory implements ProcessorFactory {

    @Override
    public Processor create(String processorName) {
        switch (processorName) {
            case "AddField":
                return new AddFieldProcessor();
            case "RemoveField":
                return new RemoveFieldProcessor();
            case "CountNumOfFields":
                return new CountNumOfFieldsProcessor();
            default:
                throw new RuntimeException("Can't parse processor: " + processorName);
        }
    }
}
