package org.patterns.behaviour.state;

public interface State {
    String getColor();
    void next(Context context);
    void prev(Context context);
}
