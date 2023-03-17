import tornadofx.*


class MyView : View() {
    override val root = vbox {
        label("Hello TornadoFX!!!")
    }
}

class MyApp : App(MyView::class)

fun main(args: Array<String>) {
    launch<MyApp>(args)
}