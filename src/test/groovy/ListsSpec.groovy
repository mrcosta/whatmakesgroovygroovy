import spock.lang.Specification

/**
 * Created by mcosta on 2/23/15.
 */
class ListsSpec extends Specification {

    def "should show that a list in groovy have the same type as in java"() {
        given:
        List javaList = new ArrayList<Integer>()
        def groovyList = []

        when:
        def groovyClass = groovyList.getClass()
        def javaClass = javaList.getClass()

        then:
        groovyClass == javaClass
    }

    def "should show how to iterate through the elements inside a list in groovy"() {
        given:
        def numbers = [1, 2, 3, 4, 5, 6]
        def copyNumbers = []

        when:
        numbers.each {
            copyNumbers.add(it)
        }

        //def map = ["222": "mateus"]
        //map["222"]

        then:
        numbers == copyNumbers
        numbers[0] == 1
    }

    def "should show how to filter elements inside a list in groovy"() {
        given:
        def numbers = [1, 2, 3, 4, 5, 6]

        when:
        def numbersFiltered = numbers.findAll {
            it > 3
        }

        then:
        numbersFiltered == [4, 5, 6]
    }

    def "should show another way to add an element inside a list"() {
        when:
        def list = [1, 2, 3] << 4
        list.add(5)

        then:
        list == [1, 2, 3, 4, 5]
    }

    def "should show the inverse index for a list"() {
        given:
        def numbers = [1, 2, 3, 4]

        when:
        def lastElement = numbers[-1]

        then:
        lastElement == 4
    }

}
