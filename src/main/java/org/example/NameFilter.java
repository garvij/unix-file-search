package org.example;

public class NameFilter implements IFilter {
    @Override
    public boolean isValid(SearchParams searchParams, File file) {
        return searchParams.name == null || searchParams.name.equals(file.getName());
    }
}
