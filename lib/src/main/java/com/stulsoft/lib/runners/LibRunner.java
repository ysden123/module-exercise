package com.stulsoft.lib.runners;

import com.stulsoft.lib.Library;

public class LibRunner {
    public static void main(String[] args) {
        System.out.println("==>main");
        System.out.printf("%b%n", (new Library()).someLibraryMethod());
    }
}
