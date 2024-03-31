package org.example;

import java.util.ArrayList;
import java.util.List;

public class FileFilter {
    private final List<IFilter> filters = new ArrayList<>();


    public FileFilter() {
        filters.add(new NameFilter());
        filters.add(new ExtensionFilter());
    }

    public boolean isValid(SearchParams searchParams, File file) {
        for (IFilter filter : this.filters) {
            if (!filter.isValid(searchParams, file)) {
                return false;
            }
        }
        return true;
    }
}
