package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Directory extends Entry {

    private final List<Entry> entries = new ArrayList<>();

    @Override
    public boolean isDirectory() {
        return true;
    }

    @Override
    public int getSize() {
        return entries.stream()
                .mapToInt(Entry::getSize)
                .sum();
    }

    public void addEntry(Entry entry) {
        this.entries.add(entry);
    }

    public List<Entry> getEntries() {
        return entries;
    }
}

