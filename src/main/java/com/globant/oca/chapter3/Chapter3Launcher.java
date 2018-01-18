package com.globant.oca.chapter3;

public class Chapter3Launcher {

    public static void main(String[] args) {
        Chapter3Launcher exampleLauncher = new Chapter3Launcher();
        String splittedPackageName[] = exampleLauncher.getClass().getPackage().toString().split("\\.");
        System.out.println("Welcome to the " + splittedPackageName[splittedPackageName.length -1] + " of OCA training");
    }
}
