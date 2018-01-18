package com.globant.oca.chapter6;

public class Chapter6Launcher {

    public static void main(String[] args) {
        Chapter6Launcher exampleLauncher = new Chapter6Launcher();
        String splittedPackageName[] = exampleLauncher.getClass().getPackage().toString().split("\\.");
        System.out.println("Welcome to the " + splittedPackageName[splittedPackageName.length -1] + " of OCA training");
    }
}
