fun main(args: Array<String>) {
    var fish = Fish()
    var animal: Animal = fish
    if (animal is Fish) // yek object az jense fish() dar animal save shode.
        animal.isHungry() // smart cast ejra shode va copiler animal ra hooshmandane be fish cast carde.
}

    open class Animal()

    class Fish() : Animal() {
        fun isHungry() {
            println("i am fish()")
    }
}



