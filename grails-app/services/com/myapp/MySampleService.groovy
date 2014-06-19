// grails-app/services/com/myapp/MySampleService.groovy
package com.myapp

class MySampleService {

    def someMethod(String arg) {
        arg?.toUpperCase()
    }
}
