package com.github.marschall.rdrand;


import java.io.File;
import java.io.IOException;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

final class Rdrand {

  private static final Value rdrand;

  static {
    Context polyglott = Context.newBuilder("llvm")
      .allowNativeAccess(true)
      .build();
    File file = new File("/home/marschall/git/rdrand-graalvm/src/main/c/rdrand.so");
    Source source;
    try {
      source = Source.newBuilder("llvm", file)
        .build();
    } catch (IOException e) {
      throw new IllegalStateException("could not load source", e);
    }
    Value cpart = polyglott.eval(source);
    rdrand = cpart.getMember("rdrand");
  }

  static long rdrand() {
    return rdrand.execute().asLong();
  }

}
