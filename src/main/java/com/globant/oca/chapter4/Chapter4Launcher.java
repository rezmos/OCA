package com.globant.oca.chapter4;

public class Chapter4Launcher {

    public static void main(String[] args) {
        Chapter4Launcher exampleLauncher = new Chapter4Launcher();
        String splittedPackageName[] = exampleLauncher.getClass().getPackage().toString().split("\\.");
        System.out.println("Welcome to the " + splittedPackageName[splittedPackageName.length -1] + " of OCA training");
    }
}
