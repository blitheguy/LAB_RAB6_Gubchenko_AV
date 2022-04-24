public class Main {
    public static void main(String[] args) {
        double[][] Scholarship = {{5, 4, 3, 4}, {5, 5, 2, 5}}; //Средняя оценка (студента - 1 массив), (аспиранта - 2 массив)
        String [][] name = {{"Андрей","Владимир","Николай","Гарри"},{"Жора","Петя","Вася","Валентин"}};//Дополнил имена, тк. массив не может быть численный и символьный одновременно
        String [][] lastname = {{"Губченко","Путин","Щеглов","Поттер"},{"Вахтангов","Васин","Петин","Хоббиходже"}};
        for (int i = 0; i < 4; i++) {
            Student student = new Student(name[0][i], lastname[0][i], "группа Java", Scholarship[0][i]);
            System.out.println("Студент - " + student.firstName + " /"+student.group+"/ " + student.lastName + "\t /Сумма стипендии на основании средней оценки будет = " + student.getScholarship());
        }
        for (int i = 0; i < 4; i++) {
            Student aspirant = new Aspirant(name[1][i], lastname[1][i], "группа Java", Scholarship[1][i], "Курсовая №1");
            System.out.println("Аспирант -\t" + aspirant.firstName + " /"+aspirant.group+"/ " + aspirant.lastName + "\t Сумма стипендии на основании средней оценки будет = " + aspirant.getScholarship());
        }
    }
}
