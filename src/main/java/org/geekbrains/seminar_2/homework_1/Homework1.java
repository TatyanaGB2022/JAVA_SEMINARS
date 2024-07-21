package org.geekbrains.seminar_2.homework_1;

/**
 * Сформируйте SQL-запрос
 * Дана строка sql-запроса:
 * <p>
 * select * from students where "
 * Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены
 * в виде json-строки в примере ниже. Если значение null, то параметр не должен попадать в запрос.
 * <p>
 * Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
 * <p>
 * String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами
 * <p>
 * Пример: Строка sql-запроса:
 * <p>
 * select * from students where
 * Параметры для фильтрации:
 * <p>
 * {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * Результат:
 * <p>
 * select * from students where name='Ivanov' and country='Russia' and city='Moscow'
 */

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже
        StringBuilder result = new StringBuilder(QUERY);

        try {
            String[] pairs = PARAMS.substring(1, PARAMS.length() - 1).split(",");
            boolean isFirstParam = true;

            for (String pair : pairs) {
                String[] keyValue = pair.split(":");
                String key = keyValue[0].trim().replace("\"", "");
                String value = keyValue[1].trim().replace("\"", "");

                if (!value.equals("null")) {
                    if (isFirstParam) {
                        result.append(key).append("='").append(value).append("'");
                        isFirstParam = false;
                    } else {
                        result.append(" and ").append(key).append("='").append(value).append("'");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}


//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework1 {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}

/**
 * Идеальное решение
 * class Answer {
 * public static StringBuilder answer(String QUERY, String PARAMS){
 * String paramsNew = PARAMS.replace('{',' ').replace('}', ' ');
 * String[] params = paramsNew.split(",");
 * StringBuilder stringBuilder = new StringBuilder(QUERY);
 * <p>
 * for (int i = 0; i < params.length; i++){
 * String[] elements = params[i].replace('"', ' ').split(":");
 * if(!"null".equals(elements[1].trim())){
 * stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
 * if (i < params.length - 2) stringBuilder.append(" and ");
 * }
 * }
 * return stringBuilder;
 * }
 * }
 * <p>
 * <p>
 * public class Homework1{
 * public static void main(String[] args) {
 * String QUERY = "";
 * String PARAMS = "";
 * <p>
 * if (args.length == 0) {
 * QUERY = "select * from students where ";
 * PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
 * }
 * else{
 * QUERY = args[0];
 * PARAMS = args[1];
 * }
 * <p>
 * Answer ans = new Answer();
 * System.out.println(ans.answer(QUERY, PARAMS));
 * }
 * }
 */
