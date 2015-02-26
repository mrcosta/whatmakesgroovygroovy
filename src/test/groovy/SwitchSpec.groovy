import spock.lang.Specification

/**
 * Created by mateus on 2/24/15.
 */
class SwitchSpec extends Specification{

    private getResult(value) {
        switch(value) {
            case 1:
                    return 1
            case "mateus":
                    return "that's my name"
            case { it.findAll{it == 3}.size() == 2 }:
                    return "size is 2"
            default:
                    return "unknow"
        }
    }

    def "should show how a switch works in groovy"() {
        when:
        def result = getResult(value)

        then:
        result == expectedResult

        where:
        value        | expectedResult
        1            | 1
        "mateus"     | "that's my name"
        [1, 2, 3, 3] | "size is 2"
        "1233"       | "unknow"
    }
}
