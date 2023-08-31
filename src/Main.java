public class Main {
            public static void main(String[] args) {
                System.out.println("Задача 1");
                // У банка появилось мобильное приложение. Поэтому теперь, когда пользователь заходит на сайт с телефона,
                // ему предлагается скачать приложение с учетом того, какая операционная система у пользователя.
                // Напишите программу, которая определяет, чем пользуется клиент (iOS или Android),
                // и выдает соответствующее сообщение:
                // Для iOS — «Установите версию приложения для iOS по ссылке».
                // Для Android — «Установите версию приложения для Android по ссылке».
                // Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).
                String osName = System.getProperty("os.name");
                if (osName.contains("Mac")){
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else if (osName.contains("Win")){
                    System.out.println("Установите версию приложения для Windows по ссылке");
                } else if (osName.contains("And")){
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else if (osName.contains("X11")){
                    System.out.println("Установите версию приложения для UNIX системы по ссылке");
                }
                System.out.println("\nЗадача 2");
                // Усложним предыдущую задачу. Теперь нам нужно знать не только операционную систему телефона, но и год его создания.
                // Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.
                // Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии:
                // Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
                // Для Android: «Установите облегченную версию приложения для Android по ссылке».
                // Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке приложения.
                // Для года создания телефона используйте переменную clientDeviceYear, в которой необходимо указать 2015 год.
                int minYear = 2000;
                int maxYear = 2023;
                int year = (int) (Math.random() * (maxYear - minYear + 1)) + minYear;
                if(year > 2015 && System.getProperty("os.name").contains("Mac")) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else if (year > 2015 && System.getProperty("os.name").contains("Win")){
                    System.out.println("Установите версию приложения для Windows по ссылке");
                } else if (year > 2015 && System.getProperty("os.name").contains("And")){
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else if (year > 2015 && System.getProperty("os.name").contains("X11")){
                    System.out.println("Установите версию приложения для UNIX системы по ссылке");
                } else if (year <= 2015 && System.getProperty("os.name").contains("Mac")){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else if (year <= 2015 && System.getProperty("os.name").contains("Win")){
                    System.out.println("Установите облегченную версию приложения для Windows по ссылке");
                } else if (year <= 2015 && System.getProperty("os.name").contains("And")){
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else if (year <= 2015 && System.getProperty("os.name").contains("X11")){
                    System.out.println("Установите облегченную версию приложения для UNIX системы по ссылке");
                }
                System.out.println("\nЗадача 3");
                // Напишите программу, которая определяет, является ли год високосным или нет.
                // Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
                // Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
                // « …. год является високосным» или «... год не является високосным».
                // Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
                // Также високосным является каждый четырехсотый год. Год должен быть больше, чем 1584
                // (в котором был введен високосный год).
                minYear = 1;
                maxYear = 2200;
                year = (int) (Math.random() * (maxYear - minYear + 1)) + minYear;
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year > 1584){
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год не является високосным");
                }
                System.out.println("\nЗадача 4");
                // В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том,
                // когда будет доставлена его карта, нужно знать расстояние от офиса до адреса доставки.
                // Правила доставки такие:
                // Доставка в пределах 20 км занимает сутки.
                // Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
                // Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
                // Свыше 100 км доставки нет.
                // То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
                // Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
                // Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
                int minDist = 0;
                int maxDist = 200;
                int deliveryDistance = (int) (Math.random() * (maxDist - minDist + 1)) + minDist;
                System.out.println("Расстояние: "+ deliveryDistance + " км");
                if (deliveryDistance <= 20){
                    System.out.println("Доставка займет сутки");
                } else if (deliveryDistance <= 60){
                    System.out.println("Доставка займет 2 дня");
                } else if (deliveryDistance <= 100){
                    System.out.println("Доставка займет 3 дня");
                } else {
                    System.out.println("Свыше 100км доставки нет.");
                }

                System.out.println("\nЗадача 5");
                // Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
                // Например, 1-й месяц (он же январь) принадлежит к сезону зима.
                // Для написания программы используйте оператор switch. Для обозначения номера месяца используйте
                // переменную monthNumber = 12.
                // Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).
                int minNumberMonth = 1;
                int maxNumberMonth = 12;
                int monthNumber = (int) (Math.random() * (maxNumberMonth - minNumberMonth + 1)) + minNumberMonth;
                switch (monthNumber) {
                    case (1): case (2): case(12): System.out.println(monthNumber + "-й месяц принадлежит зимнему сезону");
                    case (3): case (4): case(5): System.out.println(monthNumber + "-й месяц принадлежит весеннему сезону");
                    case (6): case (7): case(8): System.out.println(monthNumber + "-й месяц принадлежит летнему сезону");
                    case (9): case (10): case(11): System.out.println(monthNumber + "-й месяц принадлежит осеннему сезону");
                    default: System.out.println("Такого месяца нет!");
                }
            }
}