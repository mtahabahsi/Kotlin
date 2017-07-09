/**
 * Created by gstah on 22.06.2017.
 */
fun main(args: Array<String>){
    print("1. sayıyı giriniz:")
    var n1:Int= readLine()!!.toInt()
    print("2. sayıyı giriniz:")
    var n2:Int= readLine()!!.toInt()
    var sonuc:Int=n1+n2
    print("$n1 ile $n2 nin toplamı=$sonuc ")
    /*
    *1- ()
    *2- ++,-- (Değişkeninden önce konulmuş olan)
    *2- ^
    *3- / *
    *4- + -
    *5- =
     */

    var x=6
    var y=2
    var z=x*y--
    print("$z")
}