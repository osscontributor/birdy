// test/unit/com/myapp/MySampleServiceSpec.groovy
package com.myapp

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(MySampleService)
class MySampleServiceSpec extends Specification {

    void "test someMethod"() {
        expect:
        service.someMethod(null) == null
        service.someMethod('Thin Lizzy') == 'THIN LIZZY'
    }
}