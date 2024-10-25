class Square(var x: Int = 0, var y: Int = 0, var side: Int = 1) : Figure(3), Movable, Transforming {
    override fun area(): Float {
        return (side * side).toFloat()
    }

    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun resize(zoom: Int) {
        side *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        if (direction == RotateDirection.Clockwise) {
            val newX = centerX - (y - centerY)
            val newY = centerY + (x - centerX)
            x = newX
            y = newY
        } else {
            val newX = centerX + (y - centerY)
            val newY = centerY - (x - centerX)
            x = newX
            y = newY
        }
    }
}