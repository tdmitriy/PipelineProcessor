package com.hasw3ll.factory;


import com.hasw3ll.processor.Processor;

public interface ProcessorFactory {

    Processor create(String processorName);
}
