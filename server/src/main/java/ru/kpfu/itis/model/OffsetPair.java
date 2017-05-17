package ru.kpfu.itis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Alex on 17.05.17.
 */
public class OffsetPair {

    @JsonProperty("start")
    private long start;

    @JsonProperty("end")
    private long end;

    public OffsetPair(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }
}

