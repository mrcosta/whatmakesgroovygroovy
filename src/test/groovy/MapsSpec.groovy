import spock.lang.Specification

/**
 * Created by mcosta on 2/23/15.
 */
class MapsSpec extends Specification {

    def "should show a basic structure for a groovy map"() {
        given:
        def clients = ["x210001": "mateus", "x210002": "juca", "x210003": "pedro"]

        when:
        def myName = clients.find {it.key == "x210001"}.value

        then:
        myName == "mateus"
    }

    def "should show another way to access a position in a groovy map"() {
        given:
        def clients = ["x210001": "mateus", "x210002": "juca", "x210003": "pedro"]

        when:
        def specificName = clients["x210003"]

        then:
        specificName == "pedro"
    }

    def "should show a more complex structure that represent a json"() {
        given:
        def turnResponse = [
            legs: [
                arrival: [
                    scheduleTime: "10:00",
                    proposedTime: "09:30",
                ],
                departure: [
                    scheduleTime: "11:00",
                    proposedTime: "11:30",
                ]
            ]
        ]

        when:
        def departure = turnResponse.legs.departure

        then:
        departure == [scheduleTime: "11:00", proposedTime: "11:30"]
    }
}
