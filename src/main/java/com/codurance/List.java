package com.codurance;

public class List<T> {
  public int size() {
    return 0;
  }

  public T get(int i) {
    throw new IndexOutOfBoundsException();
  }
}
