import com.learning.groovy.controllers.MockController
import com.learning.groovy.services.MockService
import spock.lang.Specification

/**
 * Created by mateus on 2/25/15.
 */
class MockSpec extends Specification {

    def "should show how a spec that mock something works"() {
        given:
        MockController controller = new MockController(mockService: Mock(MockService))

        when:
        def result = controller.getTitles()

        then:
        1 * controller.mockService.retrieveTitles() >> ["birdman"]

        and:
        result == ["birdman", "go moises"]
    }
}
