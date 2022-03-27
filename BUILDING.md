
graalvm-ce-java11-linux-amd64-22.0.0.2.tar.gz

    gu install llvm-toolchain

    lli --print-toolchain-path

    export LLVM_TOOLCHAIN=$(lli --print-toolchain-path)

    $LLVM_TOOLCHAIN/clang -mrdrnd -shared rdrand.c -o rdrand
