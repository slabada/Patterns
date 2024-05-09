package org.patterns.structural.proxy;

import java.time.LocalDate;

public interface Report {
    String prepareReport(LocalDate localDate);
}
