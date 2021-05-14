package com.company.factories;

public interface HeroFactory  {
    BaseHero createHero(String clazz, String name, int level);
}
