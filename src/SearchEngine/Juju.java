package SearchEngine;

//A simple search engine is a useful project to practice string manipulation,
// sorting algorithms, and data organization. You'll also learn how to use two APIs: Crawl API and Search API.
//
//      In this project, you'll create a program that can take in user queries and return relevant
//      results from a pre-defined set of documents.
//
//        Some potential features to include in your search engine are:
//
//        Option for advanced searching (e.g., exact phrase match, boolean operators)
//        Sorting results based on relevance or date
//        Displaying snippets of text from the document containing the query terms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Juju {
    public static void main(String[] args) {
        //encapsulate this in tools file
        System.out.println("heyy welcome to juju!!");
        System.out.println("You want information, weve got it!!");
        System.out.println("-------------------------------------");

        //set up search engine
        Searcher searcher = new Searcher();
        Scanner in = new Scanner(System.in);
        String searchParam = in.nextLine();
        //display result
        System.out.println(searcher.processQuery(searchParam));
    }
}
