package com.globant.oca.chapter2;

public class Chapter2Launcher {

    public static void main(String[] args) {
        Chapter2Launcher exampleLauncher = new Chapter2Launcher();
        String splittedPackageName[] = exampleLauncher.getClass().getPackage().toString().split("\\.");
        System.out.println("Welcome to the " + splittedPackageName[splittedPackageName.length -1] + " of OCA training");
    }
}
