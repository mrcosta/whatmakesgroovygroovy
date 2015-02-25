package com.learning.groovy.controllers

import com.learning.groovy.services.MockService

/**
 * Created by mateus on 2/25/15.
 */
class MockController {

    def mockService

    def getTitles() {
        def titlesRetrieved = mockService.retrieveTitles();

        return titlesRetrieved << "go moises"
    }
}
