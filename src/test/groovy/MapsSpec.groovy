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
        //def myName = clients.find {it.value == "x210001"}.value

        then:
        myName == "mateus"
    }

    def "should show another way to access a position in a groovy map"() {
        given:
        def clients = ["x210001": "mateus", "x210002": "juca", "x210003": "pedro", "x": { a, b -> a + b}]

        when:
        def specificName = clients["x210003"]
        def closure = clients["x"]

        then:
        specificName == "pedro"
        closure(1, 2) == 3
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

    def "should transform a list into a map "() {
        given:
        def list = ["mateus", "moises", "giovanna"]
        def map = [:]

        when:
        list.eachWithIndex{ entry, i -> map["$i"] = entry }

       then:
        map == ["0": "mateus", "1": "moises", "2": "giovanna"]
    }}
