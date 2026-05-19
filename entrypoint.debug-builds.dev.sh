#!/bin/bash
# If CMakeCache.txt does not exist, configure the build
if [ ! -f "CMakeCache.txt" ]; then
    echo "Configuring build environment..."
    cmake -DCMAKE_BUILD_TYPE=Release \
          -DLOGLEVEL=INFO \
          -DUSE_PARALLEL=true \
          -D_NO_TIMING_TESTS=ON \
          -GNinja ..
else
    echo "Build already configured."
fi
# Execute any additional command (or drop into shell if none given)
exec "$@"