package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ListShould {
  @Test
  public void have_sizeOfZero_when_empty() {
    List<Integer> list = new List<>();
    int size = list.size();

    assertThat(size).isEqualTo(0);
  }

  @Test
  void have_sizeOfOne_when_has_one_element() {
    List<Integer> list = new List<>();
    list.add(1);
    int size = list.size();

    assertThat(size).isEqualTo(1);
  }

  @Test
  void get_element_fromEmptyArray_throwsAnException() {
    List<Integer> list = new List<>();

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.get(0);
    });
  }

  @Test
  void get_element_from_list_with_one_element_returns_the_element() {
    List<Integer> list = new List<>();
    list.add(1);

    int integer = list.get(0);

    assertThat(integer).isEqualTo(1);
  }

  @Test
  void get_element_at_position_1_from_array_with_one_element_throwsException() {
    List<Integer> list = new List<>();
    list.add(1);

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.get(1);
    });
  }
}
