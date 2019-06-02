package com.example

import grails.converters.JSON
import grails.gorm.transactions.Transactional

class BookController {

    @Transactional(readOnly = true)
    def index() {
        List<Book> books = Book.list(sort: 'dateCreated', order: 'asc')
        return [books: books] as JSON
    }
}
