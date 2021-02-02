package com.hasw3ll;

import com.hasw3ll.descriptor.PipelineDescriptor;

import java.util.List;

public class PipelineDescriptorRequest {
    private List<PipelineDescriptor> steps;

    public List<PipelineDescriptor> getSteps() {
        return steps;
    }

    public void setSteps(List<PipelineDescriptor> steps) {
        this.steps = steps;
    }
}
