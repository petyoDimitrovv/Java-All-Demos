package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AnimalList implements List<Animal> {


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Animal> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Animal animal) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Animal> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Animal> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Animal get(int index) {
        return null;
    }

    @Override
    public Animal set(int index, Animal element) {
        return null;
    }

    @Override
    public void add(int index, Animal element) {

    }

    @Override
    public Animal remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Animal> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Animal> listIterator(int index) {
        return null;
    }

    @Override
    public List<Animal> subList(int fromIndex, int toIndex) {
        return null;
    }
}

