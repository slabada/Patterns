package org.patterns.behaviour.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class DataProvider {
    private String data;

    private final PropertyChangeSupport support;

    public DataProvider() {
        support = new PropertyChangeSupport(this);
    }

    public void addSubscribe(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removeSubscribe(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setData(String value) {
        support.firePropertyChange("data", this.data, value);
        this.data = value;
    }
}
