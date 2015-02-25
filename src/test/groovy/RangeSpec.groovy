import spock.lang.Specification

/**
 * Created by mateus on 2/24/15.
 */
class RangeSpec extends Specification {

    def "should show how a range works"() {
        given:
        def range = 1..10

        when:
        def contains = range.contains(1)
        def notContais = range.contains(11)

        then:
        contains
        !notContais
    }
}
