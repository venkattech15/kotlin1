import java.util.Scanner
fun main(args : Array<String>){
    var sc = Scanner(System.`in`)
    println("Enter the limit: ")
    var l  = sc.nextInt()
    var a:Int = 0
    var b:Int = 1
    println(a)
    println(b)
    while(l>0){
       var c = a + b
        a = b
        b = c
        println(c)
        --l

    }




    }




