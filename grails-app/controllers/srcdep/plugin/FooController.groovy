package srcdep.plugin

class FooController {

    def index() { 
       render text: new Date() as String
    }
}
