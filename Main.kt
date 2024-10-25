fun main() {
    val figures: Array<Movable>
    val movableR: Movable = Rect(0,0,1,1)
    val movableC: Movable = Circle(0,0,3)
    val movableS: Movable = Square(0,0,2)

    movableR.move(1,2)
    movableC.move(1,1)
    movableS.move(2,2)

    val f: Figure = Rect(0,0,1,1)
    val f2: Figure = Circle(0,0,3)
    val f3: Figure = Square(0,0,2)

    val square = Square(0, 0, 2)
    square.resize(2)

    println("Площадь прямоугольника: ${f.area()}, круга: ${f2.area()}, квадрата: ${f3.area()}")
    println("Площадь квадрата после увеличения фигуры: ${square.area()}")
    println("Координаты квадрата до поворота - (${square.x}, ${square.y})")
    square.rotate(RotateDirection.Clockwise, 1, 1)
    println("Координаты квадрата после поворота (${square.x}, ${square.y})")
}
