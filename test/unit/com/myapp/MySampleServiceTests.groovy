package com.myapp



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(MySampleService)
class MySampleServiceTests {

    @Test
    void testSomething() {
        assert service.someMethod(null) == null
        assert service.someMethod('Genesis') == 'GENESIS'
    }
}
