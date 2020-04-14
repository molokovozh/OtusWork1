# OtusWork1
Создать новый maven-проект для автоматизации тестирования

Откройте IDE:
- Создайте новый проект (maven)
- Настройте для проекта файл .gitignore (https://www.gitignore.io/)
- В файле pom.xml укажите зависимости для
-- Selenium Java (https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
-- WebDriverManager (https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)
-- jUnit (https://mvnrepository.com/artifact/junit/junit/4.13)

- Создайте тест, который:
-- с помощью WebDriverManager, настраивает ChromeDriver
-- открывает в браузерах Chrome, FF (параметризировано) страницу https://otus.ru/
- Подключить и настроить log4j

Домашнее задание принимается в виде ссылки на GitHub репозиторий
Срок сдачи: 48 часов до следующего занятия.

Задание со звездочкой (*)
Реализовать отображение результата прогона тестов в Grafana, используя listener (TestNG) или test rule (jUnit).
Подглядывать можно сюда: https://habr.com/ru/company/otus/blog/452908/
Использовать owner http://owner.aeonbits.org/docs/usage/
Критерии оценки: +1 балл - проект компилируется и собирается
+1 балл - в результате выполнения теста, в браузере Chrome открылся сайт https://otus.ru/
+1 балл - в репозитории нет лишних файлов (.iml, директория idea и т.д.)
+1 балл - логи пишутся в консоль и файл
+5 баллов - задание со звездочкой
Рекомендуем сдать до: 13.04.2020
Статус: принято
