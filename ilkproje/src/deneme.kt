/**
 * Created by gstah on 22.06.2017.
 */
fun main(args: Array<String>){
    //Yorum satırı
    print("Adınızı giriniz:")
    var name:String= readLine()!!.toString()
    print("\nYaşınızı giriniz:")
    var age:Int= readLine()!!.toInt()
    print("\nBölümünüzü giriniz:")
    var dep= readLine()
    print("\nPi değeriniz giriniz:")
    var pi:Double= readLine()!!.toDouble()
    println(" Merhaba " + name + "\n Yaşınız:" + age + "\n Bölümünüz:" + dep + "\n Pi Sayısı:" + pi)

}