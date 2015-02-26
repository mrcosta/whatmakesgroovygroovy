import com.learning.groovy.controllers.MockController
import com.learning.groovy.services.TitleService
import spock.lang.Specification

/**
 * Created by mateus on 2/25/15.
 */
class MockSpec extends Specification {

    def "should show how a spec that mock something works"() {
        given:
        MockController controller = new MockController(titleService: Mock(TitleService))
        1 * controller.titleService.retrieveTitles() >> ["birdman"]

        when:
        def result = controller.getTitles()

        //then:


        then:
        result == ["birdman", "go moises"]
    }
}
