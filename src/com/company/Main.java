package com.company;

public class Main {


    public static void main(String[] args) {

        Hero magic = new Magic();
        Hero medic = new Medic();
        Hero warrior = new Warrior();

        HavingSuperAbility[] havingSuperAbilities = {magic, medic, warrior};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            havingSuperAbilities[i].applySuperAbility(medic.superpower);

        }
    }

}