package com.codurance;

public class List<T> {
  private T element;
  private int size;

  public int size() {
    return size;
  }

  public T get(int index) {
    if (size <= index){
      throw new IndexOutOfBoundsException();
    }else {
      return element;
    }
  }

  public void add(T element) {
    this.element = element;
    size++;
  }
}
