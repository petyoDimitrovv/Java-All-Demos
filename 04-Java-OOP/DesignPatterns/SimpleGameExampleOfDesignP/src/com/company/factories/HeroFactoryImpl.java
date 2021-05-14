package com.company.factories;

import com.company.entitys.Mage;
import com.company.entitys.Rogue;

public class HeroFactoryImpl implements HeroFactory {
    @Override
    public BaseHero createHero(String clazz, String name, int level) {
        switch (clazz) {
            case "Rogue":
                return new Rogue(name, level);
            case "Mage":
                return new Mage(name, level);
            default:
                throw new IllegalArgumentException("Invalid character");
        }
    }
}
