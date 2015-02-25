import spock.lang.Specification

/**
 * Created by mateus on 2/24/15.
 */
class GroovyTruth extends Specification {

    def "should show how some assertions with false value works"() {
        when:
        def checkNull = null
        def list = []
        def emptyString = ""
        def zero = 0

        then:
        !checkNull
        !list
        !emptyString
        !zero
    }

    def "should show how some assertions with true value works"() {
        when:
        def checkNull = new Object()
        def list = [1, 2]
        def emptyString = "moises"
        def zero = 1

        then:
        checkNull
        list
        emptyString
        zero
    }
}
