package com.globant.oca.chapter5;

public class Chapter5Launcher {

    public static void main(String[] args) {
        Chapter5Launcher exampleLauncher = new Chapter5Launcher();
        String splittedPackageName[] = exampleLauncher.getClass().getPackage().toString().split("\\.");
        System.out.println("Welcome to the " + splittedPackageName[splittedPackageName.length -1] + " of OCA training");
    }
}
