import org.br.task2
import org.junit.jupiter.api.Assertions
import kotlin.test.Test

//Напишите функцию-тест для первого пункта.
//Проверьте следующие условия для строкstr1 и str2 и str3:
class Tests {
    //Если Char не передан, ваша функция должна вернуть: str1 str2 str3
    @Test
    fun task2Test1(){
        Assertions.assertEquals("str1 str2 str3",
            task2("str1", "str2", "str3"))
    }

    //Если Char задан как ',', ваша функция должна вернуть: str1,str2,str3
    @Test
    fun task2Test2(){
        Assertions.assertEquals("str1,str2,str3",
            task2("str1", "str2", "str3", s=','))
    }
}