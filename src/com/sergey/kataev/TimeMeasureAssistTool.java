package com.sergey.kataev;

public class TimeMeasureAssistTool {
    private long beginMeasureTime;
    private long endMeasureTime;

    public TimeMeasureAssistTool() {
        beginMeasureTime = 0;
        endMeasureTime = 0;
    }
    public void beginMeasure(){
        beginMeasureTime = System.nanoTime();
    }
    public void endMeasure(){
        endMeasureTime = System.nanoTime();
    }
    public long result(){
        return endMeasureTime - beginMeasureTime;
    }

}
