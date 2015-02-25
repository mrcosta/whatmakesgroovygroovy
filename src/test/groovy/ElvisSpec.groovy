import spock.lang.Specification


/**
 * Created by mateus on 2/25/15.
 */
class ElvisSpec extends Specification {

    def "should show how elvis operator works"() {
        when:
        //               canMoises ? canMoises : "No, he can't"
        def moisesName = canMoises ?: "No, he can't"

        then:
        moisesName == answer

        where:
        canMoises       | answer
        "Yes, he can"   | "Yes, he can"
        null            | "No, he can't"
    }
}