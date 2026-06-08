public class SyntaxDrills {
    public static void main(String[] args) {
        // Завдання 1.1
        // Правильны змінні
        int вік = 26;                       // Починається з літери
        String _імя = "Олексій";                  // починається з _
        double $зарплата = 2200.80;                // починається з долара

        System.out.println("вік: " + вік);
        System.out.println("_імя: " + _імя);
        System.out.println("$зарплата: " + $зарплата);

        // Неправильні змінні

        //int 3435вік = 26;                 // починається з цифри
        //String моє_імя = "Олексій";      // починається з літери
        //double %$зарплата = 2200.80;       // починається з недопустимого символу

        // Завдання 1.2

        int score = 2;
        int Score = 5;
        int SCORe = 15;

        System.out.println("score: " + score);                   // Виводить 2
        System.out.println("Score: " + Score);                  // Виводить 5
        System.out.println("SCORE: " + SCORe);                  // Виводить 15

        // Завдання 1.3

        final int розмір_ноги = 43;
        // розмір_ноги = 45; // при активції викликає помилку через вже закріплений результат до змінної

        // Завдання 1.4

        // float Розмір = 10.5;   // 10.5 - це double за замовчуванням ,щоб виправити треба у кінці 10.5 поставити f що означає flout:
        float Нога = 10.5f;     // виправлений варіант.

        // Завдання 1.5

        //  char c = 'А';   // я їх декативува зробивши скрін помилки
        // String s = "A"; //
        // Тут винакає помилка бо char та String це різні види змінних та Java не дозволяє їх змішувати //

        // Завдання 1.6

        int a = 10;
        int b = 3;
        double результат = a / b;
        System.out.println("результат: " + результат); // В нас виходить рівно 3 ,бо число a та b - int . Для результату 3.3333333 треба щоб а чи b було double

        // Завдання 1.7

        byte маленькеЧисло = 50;
        long великеЧисло;
        великеЧисло = маленькеЧисло;
        System.out.println("маленькеЧисло: " + маленькеЧисло);
        System.out.println("великеЧисло: " + великеЧисло);

        // Завдання 1.8

        double d = 9.99;
        int r = (int) d;
        System.out.println("double d = " + d);
        System.out.println("int r = " + r);

        // Завдання 1.9

        int число = 157;
        int остача = число % 14;
        System.out.println("остача = " + число % 14);
        if (остача == 0) {
            System.out.println("157 - парне число");
        } else {
            System.out.println("157 - непарне число");
        }

        // Завднання 1.10

        System.out.println("1\t2\t3\n4\t5\t6\n7\t8\t9");

        // Завдання 1.11

        int[] arr = new int[3]; // цим кодом ми створили масив розміром 3

        // масив починає відрахунок від 0,тобто наш масив це 0,1,2

        arr[0] = 23; // перший елемент
        arr[1] = 81; // другий елемент
        arr[2] = 18; // третій елемент

        // Виводимо масивa
        System.out.print(arr[0]);
        System.out.print(arr[1]);
        System.out.print(arr[2]);

        // Завдання 1.12

        int[] мійМасив = {12, 15, 18, 26, 22};
        int first = мійМасив[0];
        int last = мійМасив[arr.length - 1];
        System.out.println("Мій масив чисел: 12, 15, 18, 26, 22");
        System.out.println("Перший елемент: " + first);
        System.out.println("Останній елемент: " + last);
        System.out.println("Довжина масиву: " + мійМасив.length);

    }
}

        // Завдання 2

       class GradeBook {
            String studentName;           // ім'я студента
            int questionScore;          // оцінка за завдання (0-100)
            int examScore;                // оцінки за екзамен (0-100)
            double finalGrade;           // фінальна оцінка

            // Конструктор

            public GradeBook(String name, int question, int exam) {
                this.studentName = name;
                this.questionScore = question;
                this.examScore = exam;
                this.finalGrade = (questionScore * 0.4) + (examScore * 0.6);

            }

            // Тест
            public static void main(String[] args) {
                GradeBook student = new GradeBook("Alex", 85, 90);
                System.out.println("Student: " + student.studentName);
                System.out.println("answer tast: " + student.questionScore);
                System.out.println("exam: " + student.examScore);
                System.out.println("Final Grade: " + student.finalGrade);
                student.calculateResult();
                student.displaySummary();

                //Завдання 2.4

                GradeBook student2 = new GradeBook("ALEX", 70, 40);
                System.out.println("Student: " + student2.studentName);
                System.out.println("answer tast: " + student2.questionScore);
                System.out.println("exam: " + student2.examScore);
                System.out.println("Final Grade: " + student2.finalGrade);
                student2.calculateResult();
                student2.displaySummary();



            }

            // Завданя 2.3

            //метод calculateResult

            public void calculateResult() {
                double que = (double) questionScore * 0.4;
                double ex = (double) examScore * 0.6;
                this.finalGrade = que + ex;
            }

            // метод displaySummary

            public void displaySummary() {
                System.out.println("\n-------GRADE REPORT------");
                System.out.println("Name:\t\t" + studentName);
                System.out.println("Raw Score:\t" + questionScore + " | " + examScore);
                System.out.println("Final Grade:\t" + finalGrade + "%" );
                System.out.println("-----------------------------");
            }
            
        }

// Завдання 3
// Завдання 3
class InvestmentTracker {
    // Змінні
    double principal;        // кількість грошей
    double interestRate;     // процентна ставка
    int years;               // кількість років

    // Конструктор
    public InvestmentTracker(double principal, double interestRate, int years) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.years = years;
    }

    // метод calculateTotal
    public double calculateTotal() {
        double total = principal * Math.pow(1 + interestRate, years);
        return total;
    }

    public void displayReport() {
        double total = calculateTotal();
        System.out.printf("Principial: $%.2f\n", principal);
        System.out.printf("Interast Rate: %.1f%%\n", interestRate * 100);
        System.out.printf("years: %d\n", years);
        System.out.printf("Total: $%.2f\n", total);
    }

    public static void main(String[] args) {
        System.out.println("\nINVESTMENT TRACKER");
        InvestmentTracker tracker = new InvestmentTracker(26793.0, 0.05, 10);
        double result = tracker.calculateTotal();
        System.out.println("Total: $" + result);
        tracker.displayReport();
    }
}

