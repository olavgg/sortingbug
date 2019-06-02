package sortingbug

import com.example.Book

class BootStrap {

    def init = { servletContext ->

        new Book(title: "Hello World").save()
        new Book(title: "Grails").save()
        new Book(title: "Groovy").save()
    }
    def destroy = {
    }
}
