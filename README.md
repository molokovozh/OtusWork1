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

Критерии оценки: +1 балл - проект компилируется и собирается
+1 балл - в результате выполнения теста, в браузере Chrome открылся сайт https://otus.ru/
+1 балл - в репозитории нет лишних файлов (.iml, директория idea и т.д.)
+1 балл - логи пишутся в консоль и файл

Статус: принято
