
#include <immintrin.h>
#include <stdint.h>

int64_t rdrand() {
    unsigned long long result = 0;

    int rc = _rdrand64_step (&result);

    return (int64_t) result;
}
