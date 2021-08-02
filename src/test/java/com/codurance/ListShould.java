package com.codurance;

import org.assertj.core.api.IndexedObjectEnumerableAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ListShould {
  @Test
  public void have_sizeOfZero_when_empty() {
    List list = new List();
    int size = list.size();

    assertThat(size).isEqualTo(0);
  }

  @Test
  void get_element_fromEmptyArray_throwsAnException() {
    List list = new List();

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.get(0);
    });
  }
}
