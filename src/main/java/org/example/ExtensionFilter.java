package org.example;

public class ExtensionFilter implements IFilter {
    @Override
    public boolean isValid(SearchParams searchParams, File file) {
        return searchParams.extension == null || searchParams.extension.equals(file.getExtension());
    }
}
