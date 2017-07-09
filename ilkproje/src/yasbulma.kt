import java.util.*

/**
 * Created by gstah on 9.07.2017.
 */
fun main(args:Array<String>)
{
    var yil=0
    var ay=0
    var gun=0


    print("Hangi yıl doğdunuz:")
    var d_yili:Int=readLine()!!.toInt()
    print("Hangi ay doğdunuz:")
    var d_ayi:Int= readLine()!!.toInt()
    print("Hangi gün doğdunuz:")
    var d_gunu:Int= readLine()!!.toInt()


    var buyil= Calendar.getInstance().get(Calendar.YEAR)
    var buay= Calendar.getInstance().get(Calendar.MONTH)+1
    var bugun= Calendar.getInstance().get(Calendar.DAY_OF_MONTH)

    if(buay>d_ayi)
    {
        yil=buyil-d_yili
        if(bugun>=d_gunu)
        {
            ay=buay-d_ayi
            gun=bugun-d_gunu
        }
        else
        {
            ay=(buay-d_ayi)-1
            gun=(bugun+30)-d_gunu
        }
    }

    else if(buay==d_ayi)
    {
     if(bugun>=d_gunu) {
         yil = buyil - d_yili
         ay=buay-d_ayi
         gun=bugun-d_gunu
     }
    }

    else
    {
        yil=(buyil-d_yili)-1
        if(bugun>=d_gunu)
        {
            ay=(buay+12)-d_ayi
            gun=bugun-d_gunu
        }
        else
        {
            ay=((buay+12)-d_ayi)-1
            gun=(bugun+30)-d_gunu
        }
    }
    println("Siz $yil yıl $ay ay $gun gündür hayattasınız!! :D")

}