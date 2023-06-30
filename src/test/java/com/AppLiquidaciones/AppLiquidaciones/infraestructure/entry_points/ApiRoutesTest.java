package com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApiRoutesTest {

    @Test
    void employeeFunctionalEndpoints() {
        ApiRoutes apiRoutes = new ApiRoutes();
        assertNotNull(apiRoutes);
    }
}