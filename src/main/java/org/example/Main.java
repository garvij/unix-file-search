package org.example;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory();
        root.setName("root");

        File f1 = new File();
        f1.setName("f1.txt");
        f1.setContent("f1".getBytes());
        root.addEntry(f1);

        Directory r1 = new Directory();
        r1.setName("r1");
        root.addEntry(r1);

        FileSearcher fileSearcher = new FileSearcher();
        SearchParams searchParams = new SearchParams();
        searchParams.extension ="txt";

        System.out.println(fileSearcher.search(root, searchParams));

    }
}