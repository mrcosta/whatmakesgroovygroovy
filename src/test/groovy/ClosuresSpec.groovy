import spock.lang.Specification

/**
 * Created by mcosta on 2/23/15.
 */
class ClosuresSpec extends Specification {

    def "should show how a closure works"() {
        given:
        def adder = {a, b -> a + b}

        when:
        def result = adder(a, b)

        then:
        result == expectedResult

        where:
        a | b | expectedResult
        1 | 2 | 3
        4 | 5 | 9
    }
}
