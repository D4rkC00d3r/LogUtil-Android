package com.d4rkc00d3r.logutil

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class LogDebugTest {

    @Test
    // Test to see if a tag is returned.
    fun `tag is valid`() {
        val result = LogDebug().tag
        assertThat(result).isNotNull()
    }
}