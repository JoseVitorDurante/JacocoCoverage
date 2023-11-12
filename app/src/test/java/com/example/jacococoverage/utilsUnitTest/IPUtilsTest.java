package com.example.jacococoverage.utilsUnitTest;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IPUtilsTest {

    @Test
    public void testValidIPv4() {
        assertTrue(IPUtils.isValidIPv4("192.168.0.1"));
        assertTrue(IPUtils.isValidIPv4("10.0.0.1"));
        assertFalse(IPUtils.isValidIPv4("256.256.256.256"));
        assertFalse(IPUtils.isValidIPv4("192.168.0.300"));
        assertFalse(IPUtils.isValidIPv4("192.168.0"));
        assertFalse(IPUtils.isValidIPv4("not_an_ip_address"));
    }
}