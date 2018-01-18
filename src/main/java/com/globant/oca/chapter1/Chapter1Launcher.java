package com.globant.oca.chapter1;

public class Chapter1Launcher {

    public static void main(String[] args) {
        Chapter1Launcher exampleLauncher = new Chapter1Launcher();
        String splittedPackageName[] = exampleLauncher.getClass().getPackage().toString().split("\\.");
        System.out.println("Welcome to the " + splittedPackageName[splittedPackageName.length -1] + " of OCA training");
    }
}
