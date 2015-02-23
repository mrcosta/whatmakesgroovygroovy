import spock.lang.Specification

/**
 * Created by mcosta on 2/23/15.
 */
class MapsSpec extends Specification {

    def "one should be equals one"() {
        when:
        def x = 1

        then:
        1 == x
    }
}
