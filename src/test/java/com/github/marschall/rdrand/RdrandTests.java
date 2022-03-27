package com.github.marschall.rdrand;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class RdrandTests {

  @Test
  void rdrand() {
    assertNotEquals(0L, Rdrand.rdrand());
  }

}
