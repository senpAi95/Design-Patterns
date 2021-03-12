package com.designpatterns.structural.composite;

public class CompositePattern {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenue = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenue);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
        claimsSubMenue.add(personalClaimsMenu);

        System.out.println(mainMenu);
    }
}
