class Circle(var x: Int = 0,var y: Int = 0, var radius: Int = 1) : Figure(2), Movable, Transforming {
    override fun area(): Float {
        return (Math.PI * radius * radius).toFloat()
    }

    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun resize(zoom: Int) {
        radius *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
    }
}