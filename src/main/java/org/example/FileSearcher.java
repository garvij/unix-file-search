package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileSearcher {
    private FileFilter fileFilter = new FileFilter();

    public List<File> search(Directory dir, SearchParams searchParams) {
        final var queue = new LinkedList<IEntry>();
        final List<File> searchResults = new ArrayList<>();

        queue.offer(dir);
        while (!queue.isEmpty()) {
            var curr = (Directory) queue.poll();
            for (Entry entry : curr.getEntries()) {
                if (entry.isDirectory()) {
                    queue.offer(entry);
                } else {
                    if (fileFilter.isValid(searchParams, (File) entry)) {
                        searchResults.add((File) entry);
                    }
                }
            }
        }
        return searchResults;
    }
}
