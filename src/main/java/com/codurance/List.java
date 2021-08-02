package com.codurance;

public class List<T> {

  private int size;

  public int size() {
    return size;
  }

  public T get(int i) {
    throw new IndexOutOfBoundsException();
  }

  public void add(T element) {
    size++;
  }
}
