# GorobetsJava
Тестовое задание выполнено на Java 11 (temurin 11) в Intelleji Idea.
Первые три задания находятся в src/Main.java, они запускаются последовательно.
Для ввода данных через консоль используются метод класса Scanner, которые работает через System.in. 

Составить алгоритм: если введенное число больше 7, то вывести “Привет”  
В задании сказано, что введенное число должно быть строго больше 7, поэтому само число 7 не попадает в этот промежуток.  
В консоле появляется текст "Введите число", если введенное число строго больше 7, выводится "Привет"
Для ввода  числовых значениий используется метод NextInt().

Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени".
Для ввода слова используется метод next() класса Scanner. Cравнение строк производится при помощи метода .equals(String) со строкой "Вячеслав". Данные сравниваются учитывая регистр, т.е "Вячеслав" != "вячеслав" 

Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3 
Решения данного задания рассчитано на массив целых чисел типа int, и не подходит для других типов. Введеная строка делится на массив строк при помощи метода .split() c разделителем ";".
Все элементы преобразуются в целочисленный тип данных при помощи метода Integer.valueOf(String). Для обработки исключения "Неверный формат строки", используется блок
try -catch. 

Задание, ответ в текстовой форме:
Дана скобочная последовательность: [((())()(())]]
Можно ли считать эту последовательность правильной?  
Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной? 

В данной скобочной последовательности нарушен Лексикографический порядок, при котором недопустимо такое расположение, когда один вид скобок закрывает другой.

Для приведение к правиильной скобочной последовательности необходимо:
1) уровнять количество скобок соответствующих типов противоположными скобками (всякой закрывающей скобки соотвествует парная открывающая скобка) 
2)  заменить непарные скобки скобками одного типа  

Пример: 

1) Заменим предпоследний символ закрывающей скобки ] символом )

   [ ( (()) () (()) ) ] 
2) заменим второй символ открывающей скобки ( символом [

   [ [ (()) () (()) ] ] 
