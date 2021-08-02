package com.codurance;

import java.lang.reflect.Array;

public class List<T> {
  private T[] elements;
  private int size;


  public List(Class<T> klass) {
    elements = (T[]) Array.newInstance(klass, 10);
  }

  public int size() {
    return size;
  }

  public T get(int index) {
    if (size <= index){
      throw new IndexOutOfBoundsException();
    }else {
      return elements[index];
    }
  }

  public void add(T element) {
    elements[size()] = element;
    size++;
  }
}
