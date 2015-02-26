import org.junit.Ignore
import spock.lang.Specification

/**
 * Created by mateus on 2/24/15.
 */
class GroovyTruth extends Specification {

    def "should show how some assertions with false value wor(ks"() {
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


    /*def "should show how some assertions with true #value works"(value) {
        given:
        def x = true

        when:
        def y = x

        then:
        value == x

        where:
        value |
        new Object()
        [1]
        "moises"
        1
    }*/

    def "test"() {
        expect:
        1 == 1 - 0
    }
}
