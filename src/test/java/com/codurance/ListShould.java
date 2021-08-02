package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ListShould {
  @Test
  public void have_sizeOfZero_when_empty() {
    List list = new List();
    int size = list.size();

    assertThat(size).isEqualTo(0);
  }
}
