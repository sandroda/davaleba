fun main(){
    val cord = Point()
    cord.ordinate =4F
    cord.abscissa =3F

    println(cord.toString())
    println(cord.abscissa == cord.ordinate)

    val info = Triangle(height = cord.ordinate, base = cord.abscissa)
    println(info.getArea())



}
interface IFigure{
    fun getArea(): Float
}


class Point {

    var abscissa: Float = 1F
    var ordinate: Float = 2F

    override fun equals(other: Any?): Boolean {
        if (other is Point)
            if (this.abscissa == this.ordinate) {
                return true
            }
        return false
    }

}
class Triangle(private val height: Float,private val base: Float): IFigure{
    override fun getArea(): Float {
        return height*base/2
    }
}