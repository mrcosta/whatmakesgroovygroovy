package com.learning.groovy.controllers
/**
 * Created by mateus on 2/25/15.
 */
class MockController {

    def titleService

    def getTitles() {
        def titlesRetrieved = titleService.retrieveTitles();

        return titlesRetrieved << "go moises"
    }
}
