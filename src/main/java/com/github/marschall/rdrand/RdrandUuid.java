package com.github.marschall.rdrand;

import java.util.UUID;

public final class RdrandUuid {

  private RdrandUuid() {
    throw new AssertionError("not instantiable");
  }

  public static UUID randomUuid() {
    long mostSigBits = Rdrand.rdrand();
    long leastSigBits = Rdrand.rdrand();
    // FIXME set to version 4
    return new UUID(mostSigBits, leastSigBits);
  }

}
