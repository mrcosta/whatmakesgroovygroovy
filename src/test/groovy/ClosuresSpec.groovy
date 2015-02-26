import com.learning.groovy.model.Person
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

    def "should show a more complex closure example"() {
        given:
        def persons = [
                new Person(name: "juca", age: 18),
                new Person(name: "pedro", age: 7),
                new Person(name: "moises", age: 8),
        ]

        when:
        def result = persons.findAll { filter(it) }.collect { it.name.toUpperCase() }.sort().join(", ")

        then:
        result == "MOISES"
    }

    def filter(def it) {
        it.age < 18 && it.name == "moises"
    }

    def "should show how a method to retrieve a attribute works in groovy"() {
        given:
        def person = new Person(name: "moises", age: 8)
        //new Person(name: "moises")

        when:
        def propertieDirectly = person.name
        def propertieWithGet = person.getName()

        then:
        propertieDirectly == propertieWithGet
    }

    /*def "should retrieve a list with the"() {
        given:
        def persons = [
            new Person(name: "juca", age: 18),
            new Person(name: "pedro", age: 7),
            new Person(name: "moises", age: 8),
        ]

        when:
        def result = persons.findAll { it.age < 18 }.collect { it.name.toUpperCase() }.sort().join(", ")

        then:
        result == "MOISES, PEDRO"
    }*/
}
