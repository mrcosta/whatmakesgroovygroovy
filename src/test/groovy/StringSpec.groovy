import spock.lang.Specification

/**
 * Created by mcosta on 2/24/15.
 */
class StringSpec extends Specification {

    def "should show how string work for groovy"() {
        given:
        def name = "mateus"

        when:
        def text = "Hello $name"

        then:
        text == "Hello mateus"
    }

    def "should show a multi-line string example"() {
        given:
        def name = "mateus"

        when:
        def text = """Hello
        $name

        """

        then:
        text == """Hello
        mateus

        """
    }
}
