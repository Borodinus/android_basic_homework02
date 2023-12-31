package org.br

import kotlin.system.measureTimeMillis

fun main() {
    println(task1(1, 1))
    println(task2("1", "2", "3", "4", "5", s='.'))
    task4(::printConsole)
}

//Напишите функцию, которая будет принимать:
//    два обязательных аргумента типа Int
//    неограниченное число дополнительных аргументов типа Int
//Функция должна возвращать сумму первого, второго и дополнительных аргументов.
//Если в функцию передано меньше двух аргументов, программа не должна собираться (ошибка компиляции).
fun task1(a:Int, b:Int, vararg args:Int): Int = a + b + args.sum()

//Напишите функцию, которая будет принимать:
//  неограниченное количество строк String
//  необязательный параметр типа Char
//Функция должна возвращать объединение строк.
//  по умолчанию, строки объединяется пробелом
//  если передан Char параметр, то объединение делается этим символом
fun task2(vararg args:String, s:Char? = null): String = args.joinToString(s?.toString() ?: " ")

//    Напишите функцию, которая бы принимала другую функцию в качестве параметра.
//    Ваша функция должна запустить функцию, переданную в аргументе, и вернуть времяее выполнения.
//    Примечание: используйте что-то долгое (например, длинный цикл с печатью) в
//    качестве тестовой функции. Иначе, вы можете не заметить, сколько времени прошло
fun task4(op: () -> Unit){
    val time = measureTimeMillis {
        op.invoke()
    }
    println("time = $time ms")
}

fun printConsole(){
    val array = Array(599999, {1})
    for (item in array)
        println(item)
}