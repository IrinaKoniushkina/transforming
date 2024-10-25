class Rect (var x: Int, var y: Int, var width: Int, var height: Int) : Figure(1), Movable, Transforming {
    override fun area(): Float {
        return (width * height).toFloat()
    }

    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun resize(zoom: Int) {
        width *= zoom
        height *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val offsetX = x - centerX
        val offsetY = y - centerY

        if (direction == RotateDirection.Clockwise) {
            x = centerX - offsetY
            y = centerY + offsetX
        } else {
            x = centerX + offsetY
            y = centerY - offsetX
        }
    }
}