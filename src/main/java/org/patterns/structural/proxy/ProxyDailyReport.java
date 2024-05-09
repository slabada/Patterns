package org.patterns.structural.proxy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ProxyDailyReport implements Report {

    private final Report dailyReport;

    private final Map<LocalDate, String> cache = new HashMap<>();

    public ProxyDailyReport(Report dailyReport) {
        this.dailyReport = dailyReport;
    }

    @Override
    public String prepareReport(LocalDate localDate) {
        if(!cache.containsKey(localDate)){
            String report = dailyReport.prepareReport(localDate);
            cache.put(localDate, report);
            return report;
        }
        return cache.get(localDate);
    }
}
