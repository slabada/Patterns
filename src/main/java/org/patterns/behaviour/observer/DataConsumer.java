package org.patterns.behaviour.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class DataConsumer implements PropertyChangeListener {
    private String data;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setData((String) evt.getNewValue());
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
